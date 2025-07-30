package com.sefadalgic.fooddelivery.app.modules.auth

import com.sefadalgic.fooddelivery.app.common.entity.ApiResponse
import com.sefadalgic.fooddelivery.app.common.entity.request.SignUpRequest

interface AuthService {
    fun signUp(user: SignUpRequest): ApiResponse<String>

    fun login(email: String, password: String): Boolean
}