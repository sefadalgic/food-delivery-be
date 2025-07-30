package com.sefadalgic.fooddelivery.app.modules.user

import com.sefadalgic.fooddelivery.app.modules.user.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<User, Int> {
    fun existsByMail(email: String): Boolean
}