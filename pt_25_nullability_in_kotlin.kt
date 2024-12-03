package intro.example

fun main() {
//    you can use question mark you don't have to use the try catch block like java or other languages.
    var name: String?=null//without question mark you can not hold the null value.
    name="John"

//    println("The name is: "+name)
//    println("The name is: "+name!!.length)//!! - it means that you are save sure that no null value will be assign in place of name.
    //!!- it will through exception.

    name?.let{//It is only when executed when the name value is not null.
        println("The name is: "+name.length)//It does not through exception it just only not print the anything
    }
}