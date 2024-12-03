package intro.example

class `pt_23_map_in_kotlin(Collection)` {

    companion object{
        @JvmStatic
        fun main(args: Array<String>) {

//            Immutable Map:
//            val aMap= mapOf<String,String>(12 to "String",false to "Rahul")//Error
            val aMap= mapOf<Any,String>(12 to "String",false to "Rahul")
            //key is always unique in map
            println(aMap)

//            Mutable Map:
            val mMap= mutableMapOf<Any,String>(12 to "Chaman",23 to "laman")
            println(mMap)

            mMap.putAll(aMap)
            println(mMap)

            mMap[23]="kishore"
            println(mMap)
        }
    }
}