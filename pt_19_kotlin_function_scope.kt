package intro.example

fun main() {

    var nam:String?=null
//    var nam:String="John"

    nam="John"
    nam?.let{//If string is null then the below code will not execute otherwise the below code will execute.
        //let return type is lambda result.
        println("The length of the name is: "+it.length)
        println("The name is: "+it)
        println("The reversed name is :"+it.reversed())

    }
//    val user:User?=null
    val user=User()

    val msg: Int? =user?.run{
        println("The name of user is $name")
        age
//        "Run Scope function"//last value will return
    }

    println("Msg is: "+msg)
//    will+let=run

//    val user=User().apply {
//     name="John"
//     age=25
//        this.mobileNo="7896540321"
//    }
//
//    val age =with(user)//one more plus point of with is that it return lambda function.
//    {
//        println("The name of user is ${name}")
////        println("The age of user is ${age}")
////        println("The mobile number of user is ${mobileNo}")
//    age
//    }
//
//    println("The age of user is: $age")
//
//    //println("The name of user is ${name}")//Error
////    println("The name of user is ${user.name}")
////    println("The age of user is ${user.age}")
////    println("The mobile number of user is ${user.mobileNo}")
//
//
//
//    user.also {//We are changing the value of the object.
//        it.name="Larry"
//        println("The Name has Changed!")
//    }
//    println("The Name is:"+user.name)
}

class User{
    var name:String="John Cena"
    var age:Int=21
    var mobileNo:String="9834582909"

}
/*
Scope Functions:
*The kotlin standard library contains several functions whose sole purpose is to execute a block of code within the context of an object.

*When you call such a function on an object with a lambda expression provided ,it forms a temporary scope.

*In this scope,you can access the object without its name.
 */

/*Types of Scope Functions:
1)with
2)let
3)run
4)apply
5)also
 */

