package com.virtualpairprogrammers.learningkotlin.kotlin

import kotlin.math.roundToInt

fun main() {
    val myDouble = 21.4
    println("Is myDouble a Double? ${myDouble is Double}")
    println("myDouble is a ${myDouble::class.qualifiedName}")

    println("myDoubles java class is a ${myDouble.javaClass}")

    val myInteger = myDouble.roundToInt()
    println("myInteger is a ${myInteger::class.qualifiedName}")
}
