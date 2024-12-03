package intro.example
interface IClass{
//    var operator: String.Companion
//        get() = String
//        set(value) = TODO()

    var operator:String

    fun square(a:Int):Int{
        return a*a
    }

}
abstract class AbClass {
    var name:String="John"
    abstract var branch:String

    fun Add(a:Int,b:Int):Int{
        return a+b//you can define default property of the interface function.
    }//In Most cases we don't give default property of the interface function.
    abstract fun operate(a:Int,b:Int):Int

}

class MyClass:AbClass(),IClass{//Initiated to a super class
//Abstract Class cannot be initiated but could be extended to a Super Class.
    override var branch: String="Computer"

    override fun operate(a: Int, b: Int): Int {
//        TODO("Not yet implemented")
    return a+b
    }

    override var operator: String
        get() = "Add"
        set(value) {}

    override fun square(a: Int): Int {
        return a*a*a
    }

}
//Abstract class is a collection of abstract as well as non-abstract classes.
fun main()
{
//val abClass=AbClass()//Error //You can not create object of the abstract class.

val c=MyClass()
    println(c.square(2))
}
//6 18

