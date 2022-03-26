package inheritance_kotlin

open class SecConstInherit(id: Int, name: String, age: Int) {

    init {
        println("Execute super constructor")
        println("ID -- $id")
        println("Name -- $name")
        println("Age -- $age")
        print("\n")
    }
}
class Child(id: Int, name: String, dept: String, age: Int) : SecConstInherit(id, name, age) {

    init {
        println("Execute Child Constructor")
        println("ID -- $id")
        println("Name -- $name")
        println("Department -- $dept")
        println("Age -- $age")
    }
}

fun main() {
    Child(101, "Sonam", "Development", 23)
}
