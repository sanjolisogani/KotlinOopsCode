fun main (args : Array<String>){
    println("Please enter integer value : ")
    try{
        var myint : Int = readLine()!!.toInt()
        println(myint)
    }
    catch(e : Exception){
        println(e)
    }
}