abstract class AnimalClass{
    abstract fun getName() : String
    open fun getSpeed():Int {
        return 2000
    }
}
class LionClass  : AnimalClass () {
    override fun getName(): String {
        return "Lion"
    }
    fun lionSpeed() : Int{
        return getSpeed()
    }
}

class TigerClass : AnimalClass(){
    override fun getName(): String {
        return " Tiger "
    }
    override fun getSpeed () : Int{
        return 3000
    }
}

fun main(args : Array<String>) {
    //var animal1=AnimalClass()
    //abstract class can not be instantiated
    var lion1=LionClass()
    println(lion1.getName()+" - "+lion1.lionSpeed())

    var tiger1 = TigerClass()
    println(tiger1.getName()+" - "+tiger1.getSpeed())
}