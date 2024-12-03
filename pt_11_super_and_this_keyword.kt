package intro.example

open class Car(chasisNo: Int) {

    init {
        println("Chasis number is "+chasisNo)
    }
    var manufacturer=10101010
    fun pressBrake():String
    {
        println("Car needs to be Stopped")
        return "Brake pressed\n"
    }
    fun pressAccln(speed:Int):String
    {
        println("Car accelerated with "+speed+" km/hr")
        return "Accelerated car\n"

    }
    fun change_gear(gearNo:Int):String
    {
        println("Gear shifted to "+gearNo)
        return "Gear Changed\n"
    }

}
class Audi(chasisNo: Int):Car(chasisNo){//object creation is very important while inheriting the parent class.
    var chasisNo=10


    init {
        println("Chasis number :"+chasisNo)

        println("Audi created "+super.manufacturer)
        println("Step 1:"+super.change_gear(1))
        println("Step 2:"+super.pressAccln(10))
        println("Step 3:"+super.change_gear(2))
        println("Step 4:"+super.pressBrake())
    }

    fun interior(chasisNo:Int)//more priority than above written chasisNo
    {
        println("Chasis No is "+this.chasisNo +" Function Chasis No is "+chasisNo)
    }

}
fun main()
{
val parent =Car(34)
val child =Audi(8)
//    println(child.interior(1234))
}
/*
this vs super
1)The this keyword points to a reference of the current class, while the super keyword points to a reference of the parent class.

2)this can be used to access variables and methods of the current class, and super can be used to access variables and methods of the parent class from the subclass.
 */