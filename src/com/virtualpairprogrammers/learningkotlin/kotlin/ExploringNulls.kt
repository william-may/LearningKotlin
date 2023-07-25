package com.virtualpairprogrammers.learningkotlin.kotlin

fun main() {
    wouldNotCompile();
    willCompileApproachIsNotTheKotlinWay()
    useNullSafeOperator()
    useNonNullAssertionOperator()
}

fun wouldNotCompile() {
    var nullableString: String? = null

    // The following line will not compile because Kotlin will catch that it's null
    // println(nullableString.toUpperCase())
}

fun willCompileApproachIsNotTheKotlinWay() {
    var name: String? = null;

    if(name != null) {
        println(name.uppercase())
    }
}

fun useNullSafeOperator() {
    var name: String? = null
    println(name?.uppercase())
}

fun useNonNullAssertionOperator() {
    var name: String? = null
    // Will compile BUT a NPE will be thrown. This approach is not SAFE
    println(name!!.uppercase())
}

fun nothingObjectType() {
    var name = null // instance of Nothing
    // name = "Bill" will not compile as you can't assign a value to a Nothing
}