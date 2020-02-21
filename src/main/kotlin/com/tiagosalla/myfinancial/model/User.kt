package com.tiagosalla.myfinancial.model

import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.time.LocalDateTime
import javax.persistence.*

@Entity
data class User(
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Long? = null,

        var name: String,

        var cpf: String,

        var login: String,

        var password: String,

        @CreationTimestamp
        var createdAt: LocalDateTime? = null,

        @UpdateTimestamp
        var updatedAt: LocalDateTime? = null
)