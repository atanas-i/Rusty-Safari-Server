package domain.destination.dtos

import kotlinx.serialization.Serializable
import java.util.UUID

@Serializable
data class Destination(
    val id: String,
    val name: String,
    val overview: String,
    val price: Price,
    val highlights: List<String>,
    val image: String
)
