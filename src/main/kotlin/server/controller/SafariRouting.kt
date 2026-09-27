package server.controller

import io.ktor.server.application.*
import io.ktor.server.routing.*
import server.controller.routes.destinationRoutes

fun Application.configureRouting() {
    routing {
        destinationRoutes()
    }
}