package com.mhaas.acmecontact.domain.response

import java.time.DayOfWeek

data class OutreachRecommendation (
    val dayOfWeek: DayOfWeek,
    val method: String = "Email"
)