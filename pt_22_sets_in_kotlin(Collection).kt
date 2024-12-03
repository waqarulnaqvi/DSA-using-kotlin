package intro.example

class `pt_22_sets_in_kotlin(Collection)` {
    companion object{
        @JvmStatic
        fun main(args: Array<String>) {
            val aSet= setOf("12",1,"Raj","Rahul")
            println(aSet)

            val mSet= mutableSetOf<Any>("Raj","Rajeev",1,false)
            println(mSet)

            mSet.add(true)
            println(mSet)

            mSet.addAll(aSet)
            println(mSet)

        }
    }
}