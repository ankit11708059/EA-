package com.emotionallyavailble

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform