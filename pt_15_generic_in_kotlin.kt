package intro.example

/*
Generics:
*Generic is defined as a product without a brand name.

*The definition of generic is something without a brand name.

*An example of generic is the type of soap with a store's label that says "soap," but without a brand name.



Generics in terms of kotlin:
*Generic are the powerful features that allow us to define classes,method and properties.

*which are accessible using different data types while keeping a check of the compile-time type safety.


Advantaqes of Generics:
*Type casting is evitable -No need to typecast the object.

*Type safety-Generic allows only single type of object at a time.

*Compile type safety-Generics code is checked at compile time for the parameterized type so that it avoids run time error.
 */
//7 25 to 8 35
fun main() {

//    val genstr=GenClass<String>("Waqarul Naqvi")
//    val genFloat=GenClass<Float>(12.0f)
//    val genint=GenClass<Int>(13)

    //You don't need to mention the type because the type is redundant.
    val genst=GenClass("Waqarul Naqvi")
    val genFloa=GenClass(12.0f)
    val genin=GenClass(13)
    val genboo=GenClass(true)
    val genboof=GenClass(false)

//    genin.Check(12)
//    genin.Check("Hello")
//    genin.Check<Float>(12.0f)
}

class GenClass<T>(value:T)
{
    init {
        println("The value is: "+value)
        Check<T>(value)
    }

    fun <T>Check(text:T)
    {
        println("Received Value is :"+text+"\n\n")
    }
}

