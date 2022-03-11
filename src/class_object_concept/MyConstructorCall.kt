package class_object_concept


open class MyConstructorCall {

    constructor(id : Int, name : String){
           println("\t this is execute 1 ")
           println("Id -- $id")
           println("Name -- $name")
    }

    constructor(id : Int, name : String, pass : String){
        println("\t this is execute 3 ")
        println("Id -- $id")
        println("Name -- $name")
        println("Password -- $pass")
    }
}

class Child : MyConstructorCall {

    constructor(id : Int, name : String):super(id, name){
        println("\t this is execute 2")
        println("ID --- $id")
        println("Name --- $name")
    }

    constructor(id : Int, name: String, pass: String):super(id, name, "MyPassword123"){

        println("\t this is execute 4 ")
        println("ID --- $id")
        println("Name --- $name")
        println("Password --- $pass")
    }
}

fun main() {
    Child(101, "Rohit")
    Child(102, "Sonam", "Soanm123")

}








//class MyConstructorCall {
//
//    constructor(id : Int, name : String):this(id, name, "myPassword"){
//        println("\t this next constructor ")
//        println("id -- $id")
//        println("Name -- $name")
//    }
//
//    constructor(id : Int, name : String, pass : String){
//
//        println("\t this is first constructor ")
//        println("ID -- $id")
//        println("Name -- $name")
//        println("Password -- $pass")
//    }
//
//}
//
//fun main() {
//    MyConstructorCall(101, "Sonam")
//}