package domain.destination.dtos

import java.util.UUID

data class Price(
    val id: String = UUID.randomUUID().toString(),
    val standard: String,
    val amount: Long,
    val includes: List<String>
)
