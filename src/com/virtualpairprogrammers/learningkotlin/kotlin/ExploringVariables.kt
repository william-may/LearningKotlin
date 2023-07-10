package com.virtualpairprogrammers.learningkotlin.kotlin

fun main() {
    val myDouble = 21.4
    println("Is myDouble a Double? ${myDouble is Double}")
    println("myDboule is a ${myDouble::class.qualifiedName}")

    println("myDoubles java class is a ${myDouble.javaClass}")
}