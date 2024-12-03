package intro.example

class pt_24_Arraylist_in_kotlin {
    companion object{
        @JvmStatic
        fun main(args: Array<String>)
        {
 val arrName= ArrayList<String>()
            arrName.add("A")
            arrName.add("B")

            arrName[0]="Raman"
            println(arrName.toString())

            arrName.removeAt(0)
//            arrName.remove("B")
            println(arrName.toString())

            var a=23
            println(" ok $a")//This lambda expression is called template in kotlin.
        }
    }
}
//9 39

//9 56