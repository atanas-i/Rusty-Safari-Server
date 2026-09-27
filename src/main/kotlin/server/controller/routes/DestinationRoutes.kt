package server.controller.routes

import io.ktor.http.HttpStatusCode
import io.ktor.server.request.receive
import io.ktor.server.request.uri
import io.ktor.server.resources.delete
import io.ktor.server.resources.get
import io.ktor.server.response.respond
import io.ktor.server.routing.*
import server.controller.resources.Destinations

fun Route.destinationRoutes() {
    get<Destinations> {

    }
    get<Destinations.Id> {

    }
    post<Destinations> {

    }
    put<Destinations.Id> {

    }
    delete<Destinations.Id> {

    }
}