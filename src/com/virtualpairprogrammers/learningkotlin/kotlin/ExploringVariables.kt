package com.virtualpairprogrammers.learningkotlin.kotlin

import java.util.*

fun main() {
    var name = "Bill"
    val surname = "May"

    println("Hello $name ${surname.uppercase(Locale.getDefault())}")
    println("the \$name variable has ${name.length} characters")
}