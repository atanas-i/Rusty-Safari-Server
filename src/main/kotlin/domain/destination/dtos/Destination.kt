package domain.destination.dtos

import java.util.UUID

data class Destination(
    val id: String = UUID.randomUUID().toString(),
    val name: String,
    val overview: String,
    val price: Price,
    val highlights: List<String>,
)
