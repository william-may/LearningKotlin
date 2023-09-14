package com.virtualpairprogrammers.learningkotlin.kotlin

// classes are public by default
class Customer(val name: String, val address: String, val age: Int) {
    constructor(name: String, age: Int) : this(name, "", age)

    override fun toString() = "$name, $address, $age"
}

// Automatically generates a toString, equals, hashcode, component AND copy methods
data class DataCustomer(val name: String, val address: String, val age: Int)

fun main(args: Array<String>) {
    val customer = Customer("Bill", "My Address", 55)
    println(customer)

    val dataCustomer = DataCustomer("John", "Johns Address", 44)
    println(dataCustomer)

    val anotherDataCustomer = dataCustomer.copy(name = "Joe")
    println(anotherDataCustomer)

    val (name, address, age) = anotherDataCustomer;

    println("$name, $address, $age")

}