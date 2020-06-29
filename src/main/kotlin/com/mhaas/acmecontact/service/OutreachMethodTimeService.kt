package com.mhaas.acmecontact.service

import com.mhaas.acmecontact.domain.client.openweathermap.ForecastForSpecificTime
import com.mhaas.acmecontact.domain.response.OutreachMethodTime
import java.time.ZoneId
import javax.inject.Singleton

@Singleton
class OutreachMethodTimeService(private val outreachMethodService: OutreachMethodService) {

    fun buildOutreachMethods(forecasts: List<ForecastForSpecificTime>) : List<OutreachMethodTime> {

        val strategies = forecasts.sortedBy { it.dt }
            .map {
                OutreachMethodTime(
                    it.dt.toEpochSecond(),
                    it.dt.atZoneSameInstant(ZoneId.of("America/Chicago")).toOffsetDateTime(),
                    outreachMethodService.determineOutreach(it))
            }
            .distinctBy { it.methods }

        return strategies
    }
}