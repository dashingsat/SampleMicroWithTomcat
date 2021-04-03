package com.example

import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Produces
import kotlinx.coroutines.delay


@Controller("/hello")
class TestControler {
    @Get("/data")
    @Produces(MediaType.TEXT_PLAIN)
   suspend fun index(): String {
         delay(5)
         return "Delayed by 5 secs"
    }
}