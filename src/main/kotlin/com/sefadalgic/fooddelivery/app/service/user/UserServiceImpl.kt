package com.sefadalgic.fooddelivery.app.service.user

import com.sefadalgic.fooddelivery.app.entity.User
import com.sefadalgic.fooddelivery.app.repository.UserRepository
import org.springframework.stereotype.Service


@Service("userService")
class UserServiceImpl(private val userRepository: UserRepository) : UserService {


}