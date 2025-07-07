package com.sefadalgic.fooddelivery.app.controller

import com.sefadalgic.fooddelivery.app.entity.ApiResponse
import com.sefadalgic.fooddelivery.app.entity.request.SignUpRequest
import com.sefadalgic.fooddelivery.app.service.auth.AuthService
import org.apache.coyote.Request
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@CrossOrigin
@RestController
@RequestMapping ("/auth")
class AuthController(@Qualifier("authService") private val authService: AuthService) {

    @PostMapping("/signUp")
    fun signUp (@RequestBody user: SignUpRequest): ResponseEntity<ApiResponse<String>> {
        val authResponse = authService.signUp(user)
        return ResponseEntity.ok(
            ApiResponse(
                message = authResponse.message,
                data = authResponse.data
            )
        )
    }

}