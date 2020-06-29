package com.mhaas.acmecontact.service

import com.mhaas.acmecontact.client.OpenWeatherMapClient
import com.mhaas.acmecontact.domain.response.OutreachRecommendationSchedule
import java.time.ZoneId
import java.time.ZoneOffset
import javax.inject.Singleton

@Singleton
class OutreachRecommendationService(
    private val openWeatherMapClient: OpenWeatherMapClient,
    private val outreachMethodTimeService: OutreachMethodTimeService
) {

    suspend fun getOutreachRecommendation(): List<OutreachRecommendationSchedule> {

        return openWeatherMapClient.getForecast().join().list
            .sortedBy {
                it.dt
            }
            .groupBy {
                it.dt.atZoneSameInstant(ZoneId.of("America/Chicago")).dayOfWeek
            }
            .map {
                OutreachRecommendationSchedule(it.key, outreachMethodTimeService.buildOutreachMethods(it.value))
            }
    }
}