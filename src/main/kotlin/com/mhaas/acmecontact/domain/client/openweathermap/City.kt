package com.mhaas.acmecontact.domain.client.openweathermap

import java.time.OffsetDateTime

data class City (
    val id: String?,
    val name: String?,
    val coord: Coord?,
    val country: String?,
    val population: Long?,
    val timezone: Long?,
    val sunrise: OffsetDateTime?,
    val sunset: OffsetDateTime?
)

data class Coord(
    val lat: Long?,
    val lon: Long?
)