//all the classes in kotlin is by default final.
//We cannot inherit final classes
//To inherit class we have to define class as open.
open class Person(){
    var name:String?=null
    var age:Int?=null
    var height:Int?=null
}
class Student : Person(){
    var StudentId : Int?=null
}
class employee : Person(){
    var employeeId: Int?=null
}

fun main (args:Array<String>){
    var myPerson = Person()
    myPerson.name="Rahul"
    println(myPerson.name)

    var myStudent=Student()
    myStudent.name="Ashu"
    myStudent.age=19
    myStudent.height=6
    myStudent.StudentId=101
    println(myStudent.name)
    println(myStudent.age!!)
    println(myStudent.height!!)
    print(myStudent.StudentId!!)

    var myemployee = employee()
    myemployee.age=25
    myemployee.employeeId=123
    myemployee.name="Rohan"

    println(myemployee.age!!)
    println(myemployee.employeeId!!)
    println(myemployee.name)


}