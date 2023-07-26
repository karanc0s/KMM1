package com.karan.kmm1

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform