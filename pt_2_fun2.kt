package intro.example

//fun summer(a:Int,b:Int?)=a+b?:2
//fun summer_(a:Int,b:Int?)=a+b!!//assertion operator
fun summer(a:Int,b:Int)=a+b//assertion operator


//fun getLength(str:String?)=str
//fun word_count(sentence:String)
//{
//
//}

fun main()
{

    var str1:String?=null

    val a=20
//    var b:Int?=30//Error Kotlin: Type mismatch: inferred type is Nothing? but Int was expected
    var b:Int=30
//    b=null//Error Kotlin: Null can not be a value of a non-null type Int
     val ans= summer(a,b)
    println(ans)
//    kotlin is a statically typed,general purpose programming language developed by JetBrains.
//    It is a object-oriented language and it is better than java.
//    It is fully interoperable with java.
//    It is less error-prone than java that means maximum error would be shown in the compile time other than run time.
//    Kotlin is null safe that means "No-null pointer exception" as compare to java.
//    We can also say kotlin as new flavor of android development.
}

//5 10
//6 40

//total 55 min

//5 54
//5 30