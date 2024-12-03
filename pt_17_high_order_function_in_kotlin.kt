package intro.example;

/*High Order Functions:
*A function which can accepts a function as parameter or can returns a function is called Higher-Order function.

* Kotlin functions can be stored in variables and data structures,passed as arguments to and returned from other higher-order functions.
 */

fun main() {
//    highOrder(printMe, add)
//
//    HighClass(printMe)

    println(highAdd(add))
}

//you can define function body in an variable.
val printMe= { println("This Line has been printed!!") }

val add={a:Int,b:Int->a+b}

val retunfunc={a:Int,b:Int->"The sum is :"+(a+b)}

fun highOrder(func:()->Unit,addfunc:(Int,Int)->Int)
{
    func()
    println(addfunc(4,4))

}

fun  highAdd(addfunc:(Int,Int)->Int):(Int,Int)->String{
    println(addfunc(4,6))
    return retunfunc
}

class HighClass(func:()->Unit)
{

}
//12 32