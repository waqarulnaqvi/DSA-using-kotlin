package intro.example

//Primary constructor:

fun main() {

    val kb=pt_7_constructor(2)
    println("The Integer is ${kb.someInt}")
    println("Calling the function :${kb.Add(12)}\n")
//    println("The Integer is ${pt_7_constructor(34).someInt}")
    //It require more memory because we create object multiple times by calling the class constructor.
    println("Calling the function :${pt_7_constructor().Add(12)}")
    //It require more memory because we create object multiple times by calling the class constructor.

}

//NOTE:1)If you want to call the secondary/custom constructor than you have to remove the primary constructor.
//2)If you want to use 2 or more than 2 constructor than only you have to use the secondary constructor otherwise there is no need of the secondary/custom constructor.
//class pt_7_constructor(val a:Int) {//Method 1://Primary Constructor
class pt_7_constructor constructor(val a:Int=1) {//Method 2://Primary Constructor
    init {//This code is automatically executed whenever this class object is created.
        println("We are getting a:"+a)
    }

    var someInt=23

    fun Add(b:Int) :Int
    {
        return a+b
    }
//    you can create constructor in kotlin by the class name and by the constructor keyword.

    /*
    Kotlin has two types of constructor-
    1)Primary Constructor
    2)Secondary/Custom Constructor
     */
//    init is also used in kotlin as an constructor.
}