package com.mhaas.acmecontact.domain.response

import java.time.DayOfWeek
import java.time.OffsetDateTime

data class OutreachRecommendation (
    val dayOfWeek: DayOfWeek,
    val strategies: List<Strategy>
)

data class Strategy(
    val startTime: OffsetDateTime,
    val method: OutreachMethod = OutreachMethod.EMAIL
)

enum class OutreachMethod(val desc: String) {
    SMS("Text Message"),
    EMAIL("E-mail"),
    PHONE("Phone")
}