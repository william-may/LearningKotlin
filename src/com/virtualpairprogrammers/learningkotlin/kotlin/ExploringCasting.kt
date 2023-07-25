package com.virtualpairprogrammers.learningkotlin.kotlin

import java.math.BigDecimal
import java.util.*
import kotlin.random.Random

fun main(args: Array<String>) {
    var result : Any

    val randomNumber = Random.nextInt(3)

    if (randomNumber == 1) {
        result = BigDecimal(30)
    }
    else {
        result = "hello"
    }

    println("Result is currently $result")

    if(result is BigDecimal) {
        result = result.add(BigDecimal(47))
    }
    else {
        result = result as String
        result = result.uppercase(Locale.getDefault())
    }


    println("Result is currently $result")
}