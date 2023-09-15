fun main(args: Array<String>) {
    divideByZero()
    var result = try {divide(5, 23)} catch (e: Exception) { 0 }
    println(result)
}