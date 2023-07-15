package com.virtualpairprogrammers.learningkotlin.kotlin

import java.math.BigDecimal
import kotlin.math.roundToInt

fun main() {
    val myDouble = 21.4
    println("Is myDouble a Double? ${myDouble is Double}")
    println("myDouble is a ${myDouble::class.qualifiedName}")

    println("myDoubles java class is a ${myDouble.javaClass}")

    val myInteger = myDouble.roundToInt()
    println("myInteger is a ${myInteger::class.qualifiedName}")

    val anotherInteger : Int = 17

    val myFloat : Float = 13.6f
    val myLong : Long = 1L;

    val result = myFloat + anotherInteger;
    println("The result is $result")

    val bd : BigDecimal = BigDecimal(17)
    println("bd is $bd")

    val bd2 : BigDecimal = bd.add(BigDecimal(30))
    println("bd2 is $bd2")
}