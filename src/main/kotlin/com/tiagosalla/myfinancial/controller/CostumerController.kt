package com.tiagosalla.myfinancial.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class CostumerController {

    @GetMapping("/")
    fun retrieveCostumers(): String{
        return "Hello World!"
    }
}