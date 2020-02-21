package com.tiagosalla.myfinancial.mapper

import com.tiagosalla.myfinancial.model.User
import com.tiagosalla.myfinancial.model.request.CreateUserRequest
import com.tiagosalla.myfinancial.model.response.UserResponse
import org.springframework.stereotype.Component
import java.time.format.DateTimeFormatter
import kotlin.streams.toList

@Component
class UserMapper {

    val formatter: DateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")

    fun userToUserResponse(user: User): UserResponse {
        return UserResponse(
                id = user.id,
                name = user.name,
                cpf = user.cpf,
                login = user.login,
                createdAt = user.createdAt.format(formatter),
                updatedAt = user.updatedAt.format(formatter)
        )
    }

    fun userToUserResponse(users: List<User>): List<UserResponse> {
        return users.stream().map(this::userToUserResponse).toList()
    }

    fun userToCreateUserRequest(createUserRequest: CreateUserRequest): User {
        return User(
                name = createUserRequest.name,
                cpf = createUserRequest.cpf,
                login = createUserRequest.login,
                password = createUserRequest.password)
    }

}