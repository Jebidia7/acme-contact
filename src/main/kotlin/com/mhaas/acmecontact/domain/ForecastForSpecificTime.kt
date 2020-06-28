package com.mhaas.acmecontact.domain

import java.time.OffsetDateTime

data class ForecastForSpecificTime (
    val dt: OffsetDateTime?,
    val main: ForecastData?
)