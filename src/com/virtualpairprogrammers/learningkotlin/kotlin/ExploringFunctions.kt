package com.virtualpairprogrammers.learningkotlin.kotlin

// arguments passed to a function are effectively vals and not vars, therefore
// they are immutable and can not be changed inside a function

// This "top level function" is public and static by default
fun printAsString(value: String) {
    println(value)
}

// This "top level function" is still static by default
private fun privatePrintAsString(value: String) {
    println(value)
}

// Single expression function
private fun addTwoNumbers(one: Double, two: Double) = one + two

// The arguments are now optional params. This is a kotlin way of overloading a function
// The value assigned can be any legit double
private fun addTwoNumbersWithDefaultValue(one: Double = 1.0, two: Double = 2.0) = one + two

private fun printSomeMaths(one: Double, two: Double) {
    println("one + two is ${one + two}")
    println("one - two is ${one - two}")
}

fun outerFunction(one: Double, two: Double) {

    fun innerFunction(a: String) {
        println(a)
    }

    innerFunction("Hello inner function")
    println("${one + two}")
}

fun withLambdaWithJavaUtilFunction(input: String, action: java.util.function.Function<String, Int>) {
    println(action.apply(input));
}

fun withLambdaKotlinWay(input: String, action: (String) -> Int) {
    println(action(input));
}

fun main(args: Array<String>) {
    printAsString("Hello World")
    privatePrintAsString("Private Hello World")

    println(addTwoNumbers(17.3, 9.6))
    println("Adding two numbers using overloaded function ${addTwoNumbersWithDefaultValue(17.3, 9.6)}")
    println("Adding two numbers using overloaded function ${addTwoNumbersWithDefaultValue(17.3)}")
    println("Adding two numbers using overloaded function ${addTwoNumbersWithDefaultValue(one = 10.1)}")
    println("Adding two numbers using overloaded function ${addTwoNumbersWithDefaultValue(two = 9.5)}")

    printSomeMaths(17.3, 9.6)
    // named parameters, you must provide a name for all params.
    printSomeMaths(two = 17.3, one = 9.6)

    outerFunction(5.5, 4.4)
    // Cannot chain outer and inner functions, will not compile!
    //outerFunction(5.5, 4.4).innerFunction("Hello Inner Function")
}
