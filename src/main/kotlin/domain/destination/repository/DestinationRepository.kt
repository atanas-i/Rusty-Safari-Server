package domain.destination.repository

import domain.destination.dtos.Destination

interface DestinationRepository {
    suspend fun createDestination(destination: Destination)
    suspend fun updateDestination(destination: Destination)
    suspend fun deleteDestination(destinationId: String): Boolean
    suspend fun getDestination(destinationId: String): Destination?
    suspend fun getDestinations(): List<Destination>
}