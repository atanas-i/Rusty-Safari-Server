package server.controller

import domain.destination.ImpDestinationService
import io.ktor.server.application.*
import io.ktor.server.routing.*
import server.controller.routes.destinationRoutes

fun Application.configureRouting() {
    routing {
        destinationRoutes(ImpDestinationService())
    }
}