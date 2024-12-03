package intro.example


fun main()
{
    val obj=pt_9_companion_object()//It is a class object.
   println("first number is  "+obj.firstno)
   println("Addition of 2 numbers  "+obj.Add(23,3))

    //Companion Object
    println("Second number is "+pt_9_companion_object.secondNO)//It is a class name reference.
    println("Multiplication of 2 number is "+pt_9_companion_object.product(12,2))//It is a class name reference.

}
class pt_9_companion_object {
    var firstno=12
    fun Add(a:Int,b:Int):Int{
        return a+b
    }
//companion object memory allocation happened in compile time and normal variable and function memory allocation in the run time.
    companion object//The variable or function that you wish to statically defined ,you can use those variable or function in companion object.
    {//It is a Companion block
        var secondNO=23
        //you don't required class object to call the companion block.
        fun product(a:Int,b:Int):Int{
            return a*b
        }
    }
}

//By default kotlin does not have a static keyword we have to use the companion object if we want to use the static keyword.

//Main motive of companion object is to save the memory and to stop the multiple object creation during runtime.

//The variable and method which is most used ,so it is better to surrounded them in the companion object.