package com.virtualpairprogrammers.learningkotlin


fun main(args: Array<String>) {
    whileLoop()
    forLoop()
}

fun whileLoop() {
    println("while Loop")
    var x: Int = 0
    while (x < 10) {
        println(x)
        x++
    }
}

fun forLoop() {
    println("for loop")
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)

    for(number in numbers) {
        println(number)
    }
}

fun destructuredForLoop() {

}