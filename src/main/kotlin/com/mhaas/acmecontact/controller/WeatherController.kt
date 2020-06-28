package com.mhaas.acmecontact.controller

import com.mhaas.acmecontact.client.OpenWeatherMapClient
import com.mhaas.acmecontact.domain.OpenWeatherMapResponse
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller("/v1/weather")
class WeatherController(private val openWeatherMapClient: OpenWeatherMapClient) {

    @Get
    suspend fun weather(): OpenWeatherMapResponse {
        val response = openWeatherMapClient.getForecast().get()
        return response
    }
}