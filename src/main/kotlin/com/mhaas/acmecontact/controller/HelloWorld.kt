package com.mhaas.acmecontact.controller

import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller("/acme-contact/v1")
class HelloWorld {

    @Get
    suspend fun hello(): HttpResponse<String> {
        return HttpResponse.ok("Hello, Acme!")
    }
}