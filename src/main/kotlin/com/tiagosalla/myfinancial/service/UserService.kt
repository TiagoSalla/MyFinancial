package com.tiagosalla.myfinancial.service

import com.tiagosalla.myfinancial.model.request.CreateUserRequest
import com.tiagosalla.myfinancial.model.request.UpdateUserRequest
import com.tiagosalla.myfinancial.model.response.UserResponse

interface UserService {

    fun findAll(): List<UserResponse>
    fun findById(id: Long): UserResponse
    fun create(createUserRequest: CreateUserRequest)
    fun update(id: Long, updateUserRequest: UpdateUserRequest)
    fun delete(id: Long)

}