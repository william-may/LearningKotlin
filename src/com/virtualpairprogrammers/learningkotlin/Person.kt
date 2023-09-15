package com.virtualpairprogrammers.learningkotlin

import java.util.Calendar
import java.util.GregorianCalendar

data class Person(val id: Long, val title: String, val firstName: String, val lastName: String, val dob: Calendar?) {

    var favoriteColor: String? = null

    fun getLastLetter(a: String) = a.takeLast(1)

    // using let function
    fun getLastLetterOfFavoriteColor() : String {
        // return if (favoriteColor == null) "" else getLastLetter(favoriteColor)

        // if favoriteColor != null return getLastLetter(favoriteColor) else return ""
        // let is allowing us to do the null safe check
        return favoriteColor?.let { getLastLetter(it) } ?: ""
    }

    fun getColorType(): String {
        val color = getUpperCaseColor();

        // think if, else if, else
        return when (color) {
            "" -> "empty"
            "RED", "GREEN", "BLUE" -> "rgb"
            else -> "other"
        }
    }

    // Example of using Elvis operator to overcome null-safe check
    // smart cast compiler warning
    fun getUpperCaseColor() : String {
        return favoriteColor?.uppercase() ?: ""
    }



    val age : Int?
        get() = getAge(dob)

    val safeAge : Int
        get() = age ?: -1 // Elvis operator, very nice!
//        get()  {
//            // We know that age can't change, it's safe to use the non-null assertion operator '!!'
//            return if (age != null) age!! else -1
//        }

    companion object {
        fun getAge(dob: Calendar?) : Int? {
            if (dob == null) return null

            val today = GregorianCalendar()
            val years = today.get(Calendar.YEAR) - dob.get(Calendar.YEAR)

            return if(dob.get(Calendar.DAY_OF_YEAR) >= today.get(Calendar.YEAR)) {
                years - 1
            } else {
                years
            }
        }
    }

    override fun toString() = "$title $firstName $lastName"
}

fun main(args: Array<String>) {
    val john = Person(1L, "Mr", "John", "Blue", GregorianCalendar(1977, 9, 3))
    val jane = Person(2L, "Mrs", "Jane", "Green", null)

    println("$john's age is ${john.age}")
    println("$jane's age is ${jane.age}")
    println("The age of someone born on 3rd May 1988 is " + Person.getAge(GregorianCalendar(1988, 5, 3)))

    val olderPerson = if(john.safeAge > jane.safeAge) john else jane

    println("The older person is $olderPerson")
}