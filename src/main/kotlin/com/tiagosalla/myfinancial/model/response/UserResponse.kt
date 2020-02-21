package com.tiagosalla.myfinancial.model.response

data class UserResponse (
        var id: Long,
        var name: String,
        var cpf: String,
        var login: String,
        var createdAt: String,
        var updatedAt: String
)