package intro.example



    fun si(p:Int ,r:Float,t:Int):Float{
        return p*r*t/100

    }
fun area(r:Float=100.0f):Float {
    return 3.14f * r * r
}

fun area_(r:Float):Float = 3.14f*r*r
fun area_of(r:Float) = 3.14f*r*r
    fun main()
    {
        println()
        println(si(200,r=22.2f,2))
        println("The area of circle = ${area(2.4f)}")
        println("The area of circle 0= ${area()}")
        println("The area of circle 1 = ${area_(2.4f)}")
        println("The area of circle 2 = ${area_of(2.4f)}")
    }