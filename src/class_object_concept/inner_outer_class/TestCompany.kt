package class_object_concept.inner_outer_class

class TestCompany {

    private var cmp_name : String = "Vrinsoft Technology"
    class CompanyDesc{
        var desp : String = "These are inner class in local variable inner function \t\n Android & IOS Application Developed"

        private var id : Int = 13421

        fun foo(){

            // println("These are Company Name -- $cmp")
            println("These are Company ID -- $id")
        }

    }

}
fun main(){
    println(TestCompany.CompanyDesc().desp)
    val tc = TestCompany.CompanyDesc()
    tc.foo()
}