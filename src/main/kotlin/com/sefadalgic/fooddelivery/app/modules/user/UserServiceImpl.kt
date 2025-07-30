package com.sefadalgic.fooddelivery.app.modules.user

import org.springframework.stereotype.Service


@Service("userService")
class UserServiceImpl(private val userRepository: UserRepository) : UserService {


}