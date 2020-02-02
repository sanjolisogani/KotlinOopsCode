fun Fact(num: Int, x:Int):Long{

    return if(num==1)   // terminate condition
        x.toLong()
    else
        Fact(num-1,x*num)   //tail recursion
}
fun main(args : Array<String>) {
    var n = 1
    var result = Fact(5,n)
    println("Factorial of 5 is: $result")
}