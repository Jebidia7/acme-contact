package com.mhaas.acmecontact.domain.response

import com.fasterxml.jackson.annotation.JsonFormat
import java.time.DayOfWeek
import java.time.OffsetDateTime

data class OutreachRecommendationSchedule(
    val dayOfWeek: DayOfWeek,
    val outreachMethodTimes: List<OutreachMethodTime>
)

data class OutreachMethodTime(
    val startTime: Long,
    @get:JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
    val startTimeAsString: OffsetDateTime,
    val methods: Set<OutreachMethod> = setOf(OutreachMethod.EMAIL)
)

enum class OutreachMethod(val desc: String) {
    SMS("Text Message"),
    EMAIL("E-mail"),
    PHONE("Phone"),
    NONE("None")
}