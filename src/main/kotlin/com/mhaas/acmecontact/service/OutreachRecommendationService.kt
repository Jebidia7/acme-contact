package com.mhaas.acmecontact.service

import com.mhaas.acmecontact.client.OpenWeatherMapClient
import com.mhaas.acmecontact.domain.response.OutreachRecommendation
import java.time.DayOfWeek
import javax.inject.Singleton

@Singleton
class OutreachRecommendationService(private val openWeatherMapClient: OpenWeatherMapClient) {

    suspend fun getOutreachRecommendation(): List<OutreachRecommendation> {

        val forecastData = openWeatherMapClient.getForecast().join()

        return listOf(
            OutreachRecommendation(DayOfWeek.MONDAY),
            OutreachRecommendation(DayOfWeek.TUESDAY),
            OutreachRecommendation(DayOfWeek.WEDNESDAY),
            OutreachRecommendation(DayOfWeek.THURSDAY),
            OutreachRecommendation(DayOfWeek.FRIDAY))
    }
}