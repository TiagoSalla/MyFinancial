package com.tiagosalla.myfinancial.model.request

import javax.validation.constraints.NotBlank

data class CreateUserRequest (
        @NotBlank(message = "O nome não pode estar em branco!")
        var name: String,

        @NotBlank(message = "O cpf não pode estar em branco!")
        var cpf: String,

        @NotBlank(message = "O login não pode estar em branco!")
        var login: String,

        @NotBlank(message = "A senha não pode estar em branco!")
        var password: String
)

