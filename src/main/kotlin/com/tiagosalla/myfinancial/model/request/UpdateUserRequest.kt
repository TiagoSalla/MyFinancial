package com.tiagosalla.myfinancial.model.request

import javax.validation.constraints.NotBlank

data class UpdateUserRequest (
        @NotBlank(message = "A senha não pode estar em branco!")
        var password: String
)