package com.mhaas.acmecontact.domain

import java.time.OffsetDateTime

data class OpenWeatherMapResponse (
    val cod: String?,
    val message: Int?,
    val cnt: Int?,
    val list: List<ForecastForSpecificTime?>?,
    val city: City?,
    val weather: List<WeatherCondition?>?,
    val clouds: Clouds?,
    val wind: Wind?,
    val rain: Rain?,
    val snow: Snow?,
    val dtTxt: OffsetDateTime?
)

data class Clouds(
    val all: String?
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