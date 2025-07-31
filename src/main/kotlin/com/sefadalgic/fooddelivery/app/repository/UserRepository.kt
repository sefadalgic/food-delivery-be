package com.sefadalgic.fooddelivery.app.repository

import com.sefadalgic.fooddelivery.app.entity.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<User, Int> {
    fun existsByMail(email: String): Boolean
}