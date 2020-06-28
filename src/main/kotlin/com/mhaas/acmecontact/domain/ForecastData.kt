package com.mhaas.acmecontact.domain

data class ForecastData (
    val temp: Double?,
    val feelsLike: Double?,
    val tempMin: Double?,
    val tempMax: Double?,
    val pressure: Int?,
    val seaLevel: Int?,
    val grndLevel: Int?,
    val humidity: Int?,
    val tempKf: Double?
)