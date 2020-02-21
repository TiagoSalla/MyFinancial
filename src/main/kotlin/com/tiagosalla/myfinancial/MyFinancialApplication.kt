package com.tiagosalla.myfinancial

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MyFinancialApplication

fun main(args: Array<String>) {
	runApplication<MyFinancialApplication>(*args)
}
