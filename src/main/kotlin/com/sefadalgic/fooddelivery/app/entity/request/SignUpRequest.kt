package com.sefadalgic.fooddelivery.app.entity.request

data class SignUpRequest(
    val fullName: String,
    val mail: String,
    val password: String
)
