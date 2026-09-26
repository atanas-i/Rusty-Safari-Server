package server.controller.routes

import io.ktor.http.HttpStatusCode
import io.ktor.server.resources.delete
import io.ktor.server.resources.get
import io.ktor.server.response.respond
import io.ktor.server.routing.*
import server.controller.resources.Destinations

fun Route.destinationRoutes() {
    get<Destinations> {
        call.respond("Destinations")
    }
    get<Destinations.Id> {
        val id = call.parameters["id"] ?: return@get call.respond(HttpStatusCode.BadRequest)
        call.respond("Destination with id: $id")
    }
    post<Destinations> {

    }
    put<Destinations.Id> {

    }
    delete<Destinations.Id> {

    }
}