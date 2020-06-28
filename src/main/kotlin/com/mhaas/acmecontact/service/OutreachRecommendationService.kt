package com.mhaas.acmecontact.service

import com.mhaas.acmecontact.client.OpenWeatherMapClient
import com.mhaas.acmecontact.domain.response.OutreachRecommendation
import com.mhaas.acmecontact.domain.response.Strategy
import java.time.DayOfWeek
import java.time.Duration
import java.time.OffsetDateTime
import javax.inject.Singleton

@Singleton
class OutreachRecommendationService(private val openWeatherMapClient: OpenWeatherMapClient) {

    suspend fun getOutreachRecommendation(): List<OutreachRecommendation> {

        val forecastData = openWeatherMapClient.getForecast().join()

        val forecastByDayOfWeek = forecastData.list
            .groupBy { it.dt.dayOfWeek }

        val now = OffsetDateTime.now()

        return listOf(
            OutreachRecommendation(DayOfWeek.MONDAY, listOf(Strategy(now))),
            OutreachRecommendation(DayOfWeek.TUESDAY, listOf(Strategy(now))),
            OutreachRecommendation(DayOfWeek.WEDNESDAY, listOf(Strategy(now))),
            OutreachRecommendation(DayOfWeek.THURSDAY, listOf(Strategy(now))),
            OutreachRecommendation(DayOfWeek.FRIDAY, listOf(Strategy(now))))
    }
}