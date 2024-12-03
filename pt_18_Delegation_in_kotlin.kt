package intro.example

/*Delegations:
*Inheritance implementation in classes and functions can be altered with the help of delegation techniques.

*Object-oriented programming languages support it innately without any boilerplate code.

*Delegation is used in Kotlin with the help of "by" Keyword.

*It is used to remove the redundant code.
 */
fun main() {
    val taskName:String="Download Task"
 val taskManager=TaskManager(BgTask(taskName),BgExecute(taskName))

    taskManager.Create()
    taskManager.Execute()
}

interface Task{
    fun Create()
}
interface ExecuteTask{
    fun Execute()
}
class BgTask(val taskName:String) :Task{
    override fun Create() {
        println("Task: "+taskName+"Created!")
    }

}

class BgExecute(val taskName: String):ExecuteTask{
    override fun Execute() {
     println("Task: "+taskName+" is Executing..")
    }

}

//Without Delegation:
//class TaskManager(val creator:Task,val executor:ExecuteTask):Task,ExecuteTask{
//    override fun Create() {
//      creator.Create()
//    }
//
//    override fun Execute() {
//        executor.Execute()
//    }
//
//}

//With Delegation:
class TaskManager(val creator:Task,val executor:ExecuteTask):Task by creator,ExecuteTask by executor

