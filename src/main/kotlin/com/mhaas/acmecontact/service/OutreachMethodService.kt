package com.mhaas.acmecontact.service

import com.mhaas.acmecontact.domain.client.openweathermap.ForecastForSpecificTime
import com.mhaas.acmecontact.domain.response.OutreachMethod
import javax.inject.Singleton

@Singleton
class OutreachMethodService {

    private val overcast = "overcast"
    private val rain = "rain"

    fun determineOutreach(forecast: ForecastForSpecificTime): Set<OutreachMethod> {

        val outreachMethods = mutableSetOf<OutreachMethod>()

        val weatherDesc = forecast.weather.first().description
        val temp = forecast.main.temp

        if (temp.compareTo(75) > 0 && !weatherDesc.contains(overcast, true)) {
            outreachMethods.add(OutreachMethod.SMS)
        }
        if (temp.compareTo(55) >= 0 && temp.compareTo(75) <= 0) {
            outreachMethods.add(OutreachMethod.EMAIL)
        }
        if (temp.compareTo(55) < 0 || weatherDesc.contains(rain, true)) {
            outreachMethods.add(OutreachMethod.PHONE)
        }
        if (outreachMethods.isEmpty()) {
            outreachMethods.add(OutreachMethod.NONE)
        }

        return outreachMethods
    }
}