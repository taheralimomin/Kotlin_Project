package getter_setter_

class User(_id : Int, _name : String, _age : Int){

//    getter and setter properties access

    var id = _id
    get() = field
    set(value) {
        field = value
    }

    var name = _name
    get() = field
    set(value) {
        field = value
    }

    var age = _age
    get() = field
    set(value) {
        field = value
    }

    fun disp(){
        println("ID -- $id")
        println("Name -- $name")
        println("Age -- $age")
    }
}

fun main() {
    val us = User(101, "Sonam", 23)
    us.disp()
    println(us.id)
}