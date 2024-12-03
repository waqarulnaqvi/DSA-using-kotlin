package intro.example

/*
Enum:
*In programming,sometimes there arises a need for a type to have only certain values.

*To accomplish this, the concept of enumeration was introduced.
Enumeration is a named list of constants.

*In Kotlin,like many other programming languages, an enum has its own specialized type ,including that something has a number of possible ways.

*Enum constants aren't just mere collections of constants- these have properties ,methods etc.

*Each of the enum constants act as separate instance of the class separated by commas.

*Enums increases readability of your code by assigning redefined names to constants.
 */

//Always try to make readable code.
fun main() {
//println("Today is :"+Days.MONDAY)
//    for (day in Days.values())
//    {
//         if (day.holiday)
//         {
//             println("$day is a holiday")
//         }
//        else
//         {
//             println("$day is not a holiday")
//
//         }
//}
        println("Gender :${Gender.MALE}, ordinal :${Gender.MALE.ordinal}")
        println("Gender :${Gender.FEMALE}, ordinal :${Gender.FEMALE.ordinal}\n\n")

    println("Day :${Days.SUNDAY}, ordinal :${Days.SUNDAY.ordinal} and Holiday :${Days.SUNDAY.holiday}")
    println("Day :${Days.MONDAY}, ordinal :${Days.MONDAY.ordinal} and Holiday :${Days.MONDAY.holiday}")

    }

//We use enumeration classes to improve the readability of the code.
enum class Days(val holiday:Boolean=false){
    SUNDAY(true),//It is good approach to write constants as capital letters.
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY(true)//with the help of enum we can define functionality of the constants.
}

enum class Direction
{
    EAST,
    WEST,
    NORTH,
    SOUTH
}
enum class Gender
{
    MALE,
    FEMALE
}
