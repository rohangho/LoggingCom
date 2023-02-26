package com.example.loggingcom

class AndroidPlatform : Platform {
    override fun eventDevice(): Map<String, String> {
        return  mapOf(Pair("Device Type","android"))
    }
}

actual fun getPlatform(): Platform = AndroidPlatform()