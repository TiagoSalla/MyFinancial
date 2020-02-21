package com.tiagosalla.myfinancial.service.impl

import com.tiagosalla.myfinancial.repository.UserRepository
import com.tiagosalla.myfinancial.service.UserService
import org.springframework.stereotype.Service

@Service
class UserServiceImpl : UserService {

    val userRepository: UserRepository
    val userMapper: UserMapper


}