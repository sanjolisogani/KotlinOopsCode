interface ComputerInterface{
    fun getName (): String
    fun getram ():Int
    fun getCPUTypes () : String
}
class Nexus : ComputerInterface {
    override fun getName(): String {
        return "Nexus 6"
    }

    override fun getram(): Int {
        return 1000
    }

    override fun getCPUTypes(): String {
        return "SnapDragon"
    }
}

class Iphone : ComputerInterface{
    override fun getName(): String {
        return "Iphone 7"
    }

    override fun getram(): Int {
        return 3000
    }

    override fun getCPUTypes(): String {
        return "A5"
    }
}

fun main(args:Array<String>){
    var myNexus = Nexus()
    println(myNexus.getName()+"  ,  "+myNexus.getram()+"  ,  "+myNexus.getCPUTypes())
    var myIphone =Iphone()
    println(myIphone.getName()+"  ,  "+myIphone.getram()+"  ,  "+myIphone.getCPUTypes())
}