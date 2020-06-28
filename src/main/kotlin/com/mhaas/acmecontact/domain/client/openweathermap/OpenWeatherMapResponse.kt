package com.mhaas.acmecontact.domain.client.openweathermap

data class OpenWeatherMapResponse(
    val cod: String?,
    val message: Int?,
    val cnt: Int?,
    val list: List<ForecastForSpecificTime>,
    val city: City?
)