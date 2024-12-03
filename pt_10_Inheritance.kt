package intro.example

//By default,Kotlin classes are final -they con't be inherited. To make a class inheritable , mark it with the open keyword.


//By default all the classes in kotlin is final.
open class ClassA{//Parent Class

    open var name="John"

    open fun Add(a:Int,b:Int):Int{//Parent class
        return a+b
    }

}

//class pt_10_Inheritance:ClassA(),cB(){//Error //Kotlin does not allow multiple class inheritance. But you can use multiple interface in 1 class.
class pt_10_Inheritance:ClassA(){//Run
//Run time polymorphism is also called as method overriding.

    override var name:String="Kamlesh"

    override fun Add(a: Int, b: Int): Int {//Derived class
        var sum=super.Add(a, b).toDouble()
        sum=Math.pow(sum, 2.0)
        return sum.toInt()
    }

}
open class cB{
    open var firstNo=12
   open fun Add(a: Int, b: Int): Int {
        return (a+b)*2
    }

  open fun Add2(a: Int, b: Int, c: Int): Int {
//        TODO("Not yet implemented")
        return (a+b+c)/3

    }
}
fun main(){

    val child=pt_10_Inheritance()
    val parent=ClassA()

    println(child.name)
    println("Child sum is :"+child.Add(2,2))
    println("Parent sum is :"+parent.Add(2,2))
}
//12 55 to 2 25
