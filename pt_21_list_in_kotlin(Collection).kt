package intro.example

class `pt_21_list_in_kotlin(Collection)` {

companion object{

    @JvmStatic
    fun main(args:Array<String>)
    {
//    Immutable list:
        val aList= listOf<Any>("Raman",1,"Rajeev",2.0,true, listOf(1,2,false),"Rahul","Rohit")//It is Any type list.
//        aList.add(23)//Error
        println(aList)

//    Mutable list:
        val mList= mutableListOf<Any>("Raman","Rajeev")
        mList.add(333)
        println(mList)

        mList.add(false)
        mList.addAll(aList)
        println(mList)

        mList.add(0,"kaman")
        println(mList)

    }
}
}