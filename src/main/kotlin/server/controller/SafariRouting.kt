package server.controller

import io.ktor.server.application.*
import io.ktor.server.resources.*
import io.ktor.server.response.*
import io.ktor.server.routing.routing
import server.controller.resources.Destinations
import server.controller.routes.destinationRoutes

fun Application.configureRouting() {
    routing {
        destinationRoutes()
    }
}