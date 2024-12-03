package intro.example

//Secondary Constructor or Custom constructor:
fun main() {
 val cons=pt_8_custom_constructor(b=6)
 val cons1=pt_8_custom_constructor(a=6)
 val cons2=pt_8_custom_constructor(1,3)
 val cons3=pt_8_custom_constructor(1,3,2)

}
//NOTE:1)If you want to call the secondary/custom constructor than you have to remove the primary constructor.
//2)If you want to use 2 or more than 2 constructor than only you have to use the secondary constructor otherwise there is no need of the secondary/custom constructor.
class pt_8_custom_constructor {//NO primary constructor

    init {//This code is automatically executed whenever this class object is created.
//        println("This code will execute!!")
    }
    constructor(a:Int=2,b:Int=12)//Default values
    {
        val sum =a+b//better approach
        println("Addition of 2 number is $sum\n")//lambda function

    }
    constructor(a:Int,b:Int,c:Int)
    {
        val sum =a+b+c//better approach
        println("Addition of 3 number is $sum\n")//lambda function

    }
}