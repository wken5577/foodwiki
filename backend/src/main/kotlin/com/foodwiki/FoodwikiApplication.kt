package com.foodwiki

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FoodwikiApplication

fun main(args: Array<String>) {
	runApplication<FoodwikiApplication>(*args)
}
