fun divideByZero() {
    try {
        println(7 / 0)
    } catch (e: ArithmeticException) {
        println("caught the exception")
    }
}

@Throws(InterruptedException::class)
fun divide(a: Int, b: Int) : Double {
    Thread.sleep(1000)
    return (a.toDouble() / b)
}