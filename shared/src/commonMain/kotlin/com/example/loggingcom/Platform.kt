package com.example.loggingcom

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform