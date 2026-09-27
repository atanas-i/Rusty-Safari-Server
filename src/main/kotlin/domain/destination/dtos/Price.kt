package domain.destination.dtos

import kotlinx.serialization.Serializable
import java.util.UUID

@Serializable
data class Price(
    val id: String,
    val standard: String,
    val amount: Long,
    val includes: List<String>
)
