package com.mhaas.acmecontact.controller

import com.mhaas.acmecontact.domain.response.OutreachRecommendation
import com.mhaas.acmecontact.service.OutreachRecommendationService
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller("/acme-contact/v1/recommendations")
class RecommendationsController(private val outreachRecommendationService: OutreachRecommendationService) {

    @Get
    suspend fun recommendations(): List<OutreachRecommendation> {
        val response = outreachRecommendationService.getOutreachRecommendation()
        return response
    }
}