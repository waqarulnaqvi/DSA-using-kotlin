package intro.example

import kotlin.math.pow
import kotlin.math.sqrt

class Animal(private val name:String,private val color:String="Pink")
{
    init {
        println("INit called")
    }
    public fun show()
    {
        println("Name : $name , Color :$color")
    }

    val run1={a:Int,b:Int->a+b}

    val pytha={a:Double,b:Double-> sqrt(a.pow(2)+b.pow(2)) }

//Better variation:
    val pythas:(Double,Double)->Double={a,b-> sqrt(a.pow(2)+b.pow(2)) }
     val print_ans={ println("lambda Expression") }
}

fun main() {
    val r=Animal(name="Billa", color = "kala")
    r.show()
    println(r.pytha(4.0,3.0))
    println(r.pythas(4.0,3.0))
    r.print_ans()


}