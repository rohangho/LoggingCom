package com.example.loggingcom

interface Platform {
    fun eventDevice(): Map<String,String>
}

expect fun getPlatform(): Platform