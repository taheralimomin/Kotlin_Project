package inheritance_kotlin

// inheritance and Primary Constructor

open class PrimaryConstEmp(name : String, age : Int, salary : Float) {
     init {
         println("Name --- $name")
         println("Salary --- $salary")
     }
}
class Developer(name: String,dept : String, age: Int, salary: Float) : PrimaryConstEmp(name, age , salary){

    init {
        println("Name $name of Department $dept with Salary per Month $salary")
    }

    fun develop(){
        println("Developer is my passion")
    }
}
class Tester(name: String, dept: String, age: Int, salary: Float) : PrimaryConstEmp(name, age, salary){
    init{
        println("Name $name of Department $dept with Salary per month $salary")
    }
    fun testing(){
        println("My Experience is QA and Automation with python as a Software Tester")
    }
}

fun main() {
    val dev = Developer("Manoj", "Android Application", 23, 45000f)
    dev.develop()
    print("\n")

    val test = Tester("Jayati", "Mean Stack Development", 26, 65000f)
    test.testing()

}