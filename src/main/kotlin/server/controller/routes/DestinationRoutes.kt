package server.controller.routes

import domain.destination.service.DestinationService
import domain.destination.dtos.Destination
import io.ktor.http.HttpStatusCode
import io.ktor.server.request.receive
import io.ktor.server.resources.delete
import io.ktor.server.resources.get
import io.ktor.server.resources.post
import io.ktor.server.response.respond
import io.ktor.server.response.respondText
import io.ktor.server.routing.*
import server.controller.resources.Destinations

fun Route.destinationRoutes(service: DestinationService) {
    get<Destinations> {
        val destinations = service.getDestinations()
        if(destinations.isEmpty()) {
            call.respondText("There are no destinations currently available")
        }
        call.respond(HttpStatusCode.OK,destinations)
    }
    get<Destinations.Id> { destinationId ->
        val id = call.parameters["id"] ?: return@get call.respond(HttpStatusCode.BadRequest)
        val destination = service.getDestination(id) ?: return@get call.respond(HttpStatusCode.NotFound)
        call.respond(HttpStatusCode.OK, destination)
    }
    post<Destinations> {
        val destination = call.receive<Destination>()
        service.createDestination(destination)
        call.respond(HttpStatusCode.Created, "Destination added successfully")
    }
    put<Destinations.Id> {

    }
    delete<Destinations.Id> {
        val id = call.parameters["id"] ?: return@delete call.respond(HttpStatusCode.BadRequest)
        val isDeleted = service.deleteDestination(id)
        if (isDeleted) {
            call.respond(HttpStatusCode.OK, "Destination deleted successfully")
        } else {
            call.respond(HttpStatusCode.NotFound, "Destination not found")
        }
    }
}