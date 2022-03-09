package class_object_concept.inner_outer_class

// inner class using the 'inner' keyword

class TestInnerClass {
    var name : String = "Renault Dashing"
    var id : Int = 101
    var city : String = "Surat"


    fun show(){
        print("\t Super Class Properties display \n ")
        println("ID -- $id")
        println("Name -- $name")
        println("City -- $city")

    }

   inner class innerClass{
       var desc = "these are inner class using keyword"
       private var inner_id :Int = 2342
       var inner_no : Int = 384355
       fun foo(){
           println("Inner Class the member function and member properties \n local variable $inner_id")
           println("\t Inner Number --- $inner_no")
       }

      inner class TesterInnerClass{
          var inner_no1 : Int = 384301

          fun foo1(){
              println("\t there are Second class of Inner \n Inner Number -- $inner_no1")
          }
      }

   }

}
fun main(){

    val sc = TestInnerClass()
    sc.show()

    println(TestInnerClass().innerClass().desc)
    val tnc1 = TestInnerClass().innerClass()
    tnc1.foo()
    val tnc2 = TestInnerClass().innerClass().TesterInnerClass()
    tnc2.foo1()

}