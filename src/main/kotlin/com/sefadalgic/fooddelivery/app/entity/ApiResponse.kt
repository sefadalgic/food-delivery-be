package com.sefadalgic.fooddelivery.app.entity

data class ApiResponse<T>(
    val message: String? = null,

    val status: Int? = null,

    val data: T? = null,

    val success : Boolean = true
)
