package com.mhaas.acmecontact.client

import com.mhaas.acmecontact.domain.client.openweathermap.OpenWeatherMapResponse
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.QueryValue
import io.micronaut.http.client.annotation.Client
import java.util.concurrent.CompletableFuture

@Client("https://api.openweathermap.org/data/2.5")
interface OpenWeatherMapClient {

    @Get("/forecast")
    fun getForecast(
        @QueryValue q: String = "minneapolis,us",
        @QueryValue units: String = "imperial",
        @QueryValue appid: String = "09110e603c1d5c272f94f64305c09436"
    ): CompletableFuture<OpenWeatherMapResponse>
}