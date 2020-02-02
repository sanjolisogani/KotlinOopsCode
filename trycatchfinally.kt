fun main (args: Array<String>){
    try {
        var int = 10 / 0
        println(int)
    } catch (e: ArithmeticException) {
        println(e)
    } finally {
        println("This block always executes")
    }
}   