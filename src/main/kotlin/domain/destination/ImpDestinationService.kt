package domain.destination

import data.destinationStorage
import domain.destination.dtos.Destination

class ImpDestinationService : DestinationService {
    override suspend fun createDestination(destination: Destination) {
        destinationStorage.add(destination)
    }

    override suspend fun updateDestination(destination: Destination) {
        TODO("Not yet implemented")
    }

    override suspend fun deleteDestination(destinationId: String): Boolean {
       return destinationStorage.removeIf { it.id == destinationId }
    }

    override suspend fun getDestination(destinationId: String): Destination? {
        return destinationStorage.find { it.id == destinationId }
    }

    override suspend fun getDestinations(): List<Destination> {
        return destinationStorage.toList()
    }
}