package com.sefadalgic.fooddelivery.app.service.auth

import com.sefadalgic.fooddelivery.app.entity.ApiResponse
import com.sefadalgic.fooddelivery.app.entity.User
import com.sefadalgic.fooddelivery.app.entity.request.SignUpRequest

interface AuthService {
    fun signUp(user: SignUpRequest): ApiResponse<String>

    fun login(email: String, password: String): Boolean
}