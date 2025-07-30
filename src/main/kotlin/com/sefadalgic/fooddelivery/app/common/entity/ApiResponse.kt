package com.sefadalgic.fooddelivery.app.common.entity

data class ApiResponse<T>(
    val message: String? = null,

    val data: T? = null,

    val success : Boolean = true
)
