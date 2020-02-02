class Animals{
    public var animalName:String=" "
}
class Computer{
    private var computerName:String=" "
}
open class Person2{
    protected var personName:String=" "
}
class Student1:Person2 () {
    fun changePersonName(){
        personName="Rahul"
        println(personName)
    }
}

fun main (args:Array<String>){
    var myLion = Animals()
    myLion.animalName="lion"
    println(myLion.animalName)

    var computer1 = Computer()
    //computer1.computerName = "iPhone"

    var stud = Student1()
    stud.changePersonName()
}