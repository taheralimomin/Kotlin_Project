package inheritance_kotlin

open class TestEmployee(name : String, age : Int, salary : Float) {

    init {
        println("Name -- $name")
        println("Age -- $age")
        println("Salary -- $salary")
    }
}
class Programmer(name: String, age: Int, salary: Float):TestEmployee(name, age, salary){

    fun message(){
        println("Programmer is my passion")
    }
}
class Salesman(name: String, age: Int, salary: Float):TestEmployee(name, age, salary){
    fun foo(){
        println("QA and Product Manager Experience Skills")
    }
}

fun main() {
    val pg = Programmer("Sonam", 23, 50000F)
    pg.message()

    val sm = Salesman("Rahul", 23, 70000F)
    sm.foo()
}