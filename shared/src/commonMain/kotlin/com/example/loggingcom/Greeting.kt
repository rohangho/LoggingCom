package com.example.loggingcom

import io.ktor.client.*
import io.ktor.client.request.*
import io.ktor.client.statement.*


class Greeting {
    private val platform: Platform = getPlatform()

    fun greet(eventData:Map<*,*>) {
       val finalEvent = eventData+ getPlatform().eventDevice()
        //callApi()
    }

    suspend  fun callApi() {

    }

    private val client = HttpClient()

    suspend fun greeting(): String {
        val response = client.get("https://ktor.io/docs/")
        return response.bodyAsText()
    }

}