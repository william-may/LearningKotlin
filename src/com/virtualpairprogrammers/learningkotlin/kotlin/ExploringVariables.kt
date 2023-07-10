package com.virtualpairprogrammers.learningkotlin.kotlin

import java.util.*

fun main() {
    var name = "Bill"
    val surname = "May"

    println("Hello $name ${surname.uppercase(Locale.getDefault())}")
    println("the \$name variable has ${name.length} characters")

    val story = """It was a dark and stormy night.
        |A foul smell crept across the city.
        |Jane wondered what it was, and when would be daylight.""".trimMargin("|")

    println(story)
}