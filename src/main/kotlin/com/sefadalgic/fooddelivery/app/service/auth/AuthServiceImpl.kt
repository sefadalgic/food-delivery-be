package com.sefadalgic.fooddelivery.app.service.auth

import com.sefadalgic.fooddelivery.app.entity.ApiResponse
import com.sefadalgic.fooddelivery.app.entity.User
import com.sefadalgic.fooddelivery.app.entity.request.SignUpRequest
import com.sefadalgic.fooddelivery.app.repository.UserRepository
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.stereotype.Service

@Service(value = "authService")
class AuthServiceImpl(
    private val userRepository: UserRepository,
    private val passwordEncoder: PasswordEncoder
) : AuthService {
    override fun login(email: String, password: String): Boolean {
        TODO("Not yet implemented")
    }

    override fun signUp(user: SignUpRequest): ApiResponse<String> {
        if (userRepository.existsByMail(user.mail)) {
            throw IllegalArgumentException("Email already exists")
        }

        val newUser = User(
            name = user.fullName,
            mail =  user.mail,
            password = passwordEncoder.encode(user.password)
        )

        userRepository.save(newUser)

        return ApiResponse(
            message = "User registered successfully",
            data = "Success",
            success = true
        )

    }
}