package intro.example


/*
Lambdas
1)It is just a Function without name.

2)Also known as Anonymous Functions.

{x,y -> x+y}
 |       |
 |      Body
 Parameters
 */


fun main()
{
//println("The Square of normal function 2 is: "+ Square(2))
//println("The Square of lambda expression is: "+ Sqr(2))
//println("The Square2 of lambda expression is: "+ Sqr1(2))
//Cube
Cube1("Azaan")
Cube2("Azaan")
//println("Addition of 2 number in lambda expression is: "+ Addition(4,5))
println("Addition of 2 number in lambda expression is: "+ Addition2(4,5))
//println (pname())//By default function return type value is Unit.
//When function (does not return anything) or void  then it returns Unit.
pname()
pname2()
}
//when function does not return anything in kotlin then it returns Unit.

fun Square(a:Int):Int{
    return a*a
}
val Sqr: (Int)->Int={x->x*x}
val Sqr1 ={x:Int->x*x}
//val Cube = println("Cube of 3 is "+(3*3*3))
val Cube1 = {str:String-> println("Name is  "+str) }
val Cube2: (String)->Unit={str2-> println("Name is  "+str2) }

val Addition ={x:Int,y:Int->x+y}
val Addition2: (Int,Int)->Int={x,y->x+y}

val pname:()->Unit = { println("Hello brother") }
val pname2= { println("Hello brother") }
