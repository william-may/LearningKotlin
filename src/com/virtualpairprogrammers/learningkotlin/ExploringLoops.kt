package com.virtualpairprogrammers.learningkotlin


fun main(args: Array<String>) {
    whileLoop()
    forLoop()
    destructuredForLoop()
    iterateOverMap()
    iterateWithRange()
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

    val people = listOf(
        Person(1, "Mr", "James", "Apple", null),
        Person(2, "Miss", "Sophie", "Orange", null),
        Person(3, "Mrs", "Anita", "Cherry", null)
    )

    for((id, title, surName) in people) {
        println("$title $surName has id $id")
    }

}

fun iterateOverMap() {
    val people = HashMap<Int, Person>()

    people[1] = Person(1, "Mr", "James", "Apple", null)
    people[2] = Person(2, "Miss", "Sophie", "Orange", null)
    people[3] = Person(3, "Mrs", "Anita", "Cherry", null);

    for((key, value) in people) {
        println("${value.title} ${value.lastName} has id ${value.id}")
    }
}

fun iterateWithRange() {
    val myRange = 0..3

    for(i in myRange) {
        println(i)
    }

    println("As a lambda")
    myRange.forEach { println(it) }

    println("Count backwards")
    (9 downTo 0).forEach { println(it) }
}