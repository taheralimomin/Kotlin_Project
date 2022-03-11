package inheritance_kotlin

open class CompanyEmp {

//    properties

     var cmp_name : String = "Vrinsoft"
     var location : String= "Ahmedabad"
     var depart : String = "Android Developer"

//    member function

    fun disp(){

        println("\t Company Information ")
        println("Company Name --- $cmp_name")
        println("Company Location --- $location")
    }
}


open class Employee : CompanyEmp(){
//    properties

    var emp_name = "Sonam Gupta"
    var address = "Mahesana"
    var email : String = "sonam@vrinsoft.com"
    var password : String = "1234545"
    var salary : Long = 50000L

//    member function
    fun show(){
        println("\t Employee Information ")
        println("Employee Name --- $emp_name")
        println("Employee of CompanyName --- $cmp_name")
        println("Employee Department --- $depart")
        println("Employee City --- $address")
        println("Employee Username --- $email")
        println("Employee Password --- $password")
        println("Employee Salary --- $salary")
    }


}

class Vendor : Employee() {

    var vendor_name = "Piyush Kumar"
    var depart_vend = "Product Manager"

    fun put(){
        println("\t Vendor Information ")
        println("Company Name --- $cmp_name")
        println("Vendor Name --- $vendor_name")
        println("Vendor Address --- $address")
        println("Vendor Department --- $depart_vend")

    }

}

fun main() {
    val cp = CompanyEmp()
    cp.disp()

   val emp = Employee()
    emp.show()

   val vd = Vendor()
    vd.put()
}