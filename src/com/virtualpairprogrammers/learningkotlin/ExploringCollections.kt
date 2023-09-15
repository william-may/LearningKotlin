package com.virtualpairprogrammers.learningkotlin

fun main(args: Array<String>) {

arrayStuff()
}

fun listStuff() {
    // this is an immutable ArrayList<String>
    val colors = listOf("Red", "Green", "Blue")

    // this is a mutable ArrayList<String>
    val days = mutableListOf("Monday", "Tuesday", "Wednesday")

    // Declare an empty list, must declare type
    val numbers = listOf<Int>()
}

fun mapStuff() {
    val webColors = mapOf("red" to "ff0000", "blue" to "00ff00")
}

fun arrayStuff() {

    val intArray = arrayOf(1, 2, 3, 4, 5)
    val intArrayTwo : IntArray = intArrayOf(1, 2, 4, 5)

    // Arrays are always mutable
    intArrayTwo.set(2, 3)

    intArrayTwo.forEach { println(it) }
}