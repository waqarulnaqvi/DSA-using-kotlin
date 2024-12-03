package intro.example

interface Add{
    var firstNo:Int
    fun Add(a:Int ,b:Int):Int
    fun Add2(a:Int ,b:Int,c:Int):Int
}
//class pt_10_Inheritance:ClassA(),cB(){//Error //Kotlin does not allow multiple class inheritance. But you can use multiple interface in 1 class.
//class pt_10_Inheritance:ClassA(){//Run
class pt_12_interface :Add{

    override var firstNo=1
    override fun Add(a: Int, b: Int): Int {
        return a+b
    }

    override fun Add2(a: Int, b: Int, c: Int): Int {
//        TODO("Not yet implemented")
        return a+b+c

    }
}
class B:Add{
    override var firstNo=12
    override fun Add(a: Int, b: Int): Int {
        return (a+b)*2
    }

    override fun Add2(a: Int, b: Int, c: Int): Int {
//        TODO("Not yet implemented")
        return (a+b+c)/3

    }
}
fun main() {
val it=pt_12_interface()

    println("The no is "+it.firstNo)
    println("The sum of 2 no is "+it.Add(5,6))
    println("The sum of 3 no is "+it.Add2(5,6,3)+"\n\n")


    val b=B()

    println("The no is "+b.firstNo)
    println("The sum of 2 no is "+b.Add(5,6))
    println("The sum of 3 no is "+b.Add2(5,6,3)+"\n\n")


}

//4 51 -  5 51
//Interface: An interface is a reference type

