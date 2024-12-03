package intro.example


//The best use of triple is that you can return multiple output of the function using the triple.
fun main() {
    var (a,b)=Pair("a",Pair("a","b"))
    var name=Pair("a",1)

println("$a and $b")
println("${name.first} and ${name.second}  and $name")

    var (x,y,z)=Triple("a","b",false)
    var name1=Triple("a","b",Triple(1,12,"run"))

    println("$x and $y and $z")
    println("${name1.first} and ${name1.second}  and ${name1.third.first} and ${name1.third} and $name1")



}
