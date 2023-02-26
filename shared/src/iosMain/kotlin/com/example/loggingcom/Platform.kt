package com.example.loggingcom

import platform.UIKit.UIDevice

class IOSPlatform: Platform {
    override fun eventDevice(): Map<String, String> {
        return  mapOf(Pair("Device Type","ios"))
    }}

actual fun getPlatform(): Platform = IOSPlatform()