package intro.example;

fun main() {
    val kb=Classes_and_Object()
    println("The Integer is ${kb.someInt}")
    println("The Integer is ${Classes_and_Object().someInt}")
    println("Calling the function :${Classes_and_Object().Add(12,11)}")
}
class Classes_and_Object
{
    var someInt=23

    fun Add(a:Int,b:Int) :Int
    {
        return a+b
    }
}
