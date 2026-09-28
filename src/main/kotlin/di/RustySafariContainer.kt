package di

import domain.destination.repository.DestinationRepository
import domain.destination.repository.ImplDestinationRepository
import domain.destination.service.DestinationService
import domain.destination.service.ImpDestinationService

object RustySafariContainer {
    fun provideDestinationService(): DestinationService = ImpDestinationService()
    fun provideDestinationRepository(): DestinationRepository = ImplDestinationRepository(provideDestinationService())
}