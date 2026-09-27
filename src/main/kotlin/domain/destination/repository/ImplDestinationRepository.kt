package domain.destination.repository

import domain.destination.dtos.Destination
import domain.destination.service.DestinationService

class ImplDestinationRepository(
    private val service: DestinationService
) : DestinationRepository {
    override suspend fun createDestination(destination: Destination) {
        service.createDestination(destination)
    }

    override suspend fun updateDestination(destination: Destination) {
        service.updateDestination(destination)
    }

    override suspend fun deleteDestination(destinationId: String): Boolean {
        return service.deleteDestination(destinationId)
    }

    override suspend fun getDestination(destinationId: String): Destination? {
        return service.getDestination(destinationId)
    }

    override suspend fun getDestinations(): List<Destination> {
        return service.getDestinations()
    }
}