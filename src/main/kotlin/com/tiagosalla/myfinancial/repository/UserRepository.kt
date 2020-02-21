package com.tiagosalla.myfinancial.repository

import com.tiagosalla.myfinancial.model.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<User, Long> {}