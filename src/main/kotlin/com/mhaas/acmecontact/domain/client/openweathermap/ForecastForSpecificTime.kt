package com.mhaas.acmecontact.domain.client.openweathermap

import java.time.OffsetDateTime

data class ForecastForSpecificTime (
    val dt: OffsetDateTime,
    val main: ForecastData,
    val weather: List<WeatherCondition>,
    val clouds: Clouds?,
    val wind: Wind?,
    val rain: Rain?,
    val snow: Snow?,
    val sys: Sys?,
    val dtTxt: String?
)

data class Clouds(
    val all: Int?
)

data class Wind(
    val speed: Double?,
    val deg: Int?
)

data class Rain(
    val threeH: String?
)

data class Snow(
    val threeH: String?
)

data class Sys(
    val pod: String?
)