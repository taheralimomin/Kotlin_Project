package class_object_concept


class Registration(email: String, password: String){

//    properties

      var rid : Int? = null
      var rname : String = ""
      var remail : String = email
      var rpassword : String = ""



//    secondary constructor

    constructor(id : Int, name : String, email : String, password: String):this(email, password)
    {
        rid = id
        rname = name
    }

//    initializer

     init {
            rpassword = password

     }


//    member function

    fun show(){

        println("Register ID --- $rid")
        println("Register Name --- $rname")
        println("Email ID --- $remail")
        println("Password --- $rpassword")
    }

}

fun main() {
    val reg = Registration(101, "Sonam", "sonam123@gmail.com", "sonam@123")
    reg.show()
}


// secondary constructor

//class Student{
//
//    var sid : Int
//    var sname : String
//    var sage : Int
//
////    properties
//
//      constructor(id : Int, name : String, age : Int){
//
//          println("Constructor Called")
//
//           sid = id
//           sname = name
//           sage = age
//      }
//
////    member function
//
//      fun disp(){
//          println("Student Id -- $sid")
//          println("Student Name -- $sname")
//          println("Student Age -- $sage")
//      }
//
//}
//
//fun main() {
//    val st = Student(101, "jhon", 23)
//    st.disp()
//}






// primary constructor


//class Person constructor(val fname : String, val lname : String, val age : Int){
//
//    var gender : String = "Male"
//
//
//    fun disp(){
//        println("Person FirstName --- $fname")
//        println("Person LastName --- $lname")
//        println("Person Age --- $age")
//        println("Person Gender --- $gender")
//
//    }
//
//}
//
//fun main() {
//
//    val pr = Person("Taherali", "khatasiya", 23)
//   pr.disp()
//}










//class Person(name : String) {
//
//     val fPropertyt = "First property :: $name".also(:: println)
//
//    init {
//        println("First property block that print $name")
//    }
//
//    val personKey = name.uppercase()
//
//    init {
//        println("person key block that print cases ::: $personKey")
//    }
//}
//fun main(){
//    Person("jetbrains kotlin")
//}