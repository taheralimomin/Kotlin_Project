package class_object_concept

class TestMobile(name : String) {

   var model : String = "Samsung note5"
   var price : Float = 13500.00F

   val firstProperty = "First Property :: $name".also(:: println)

    init {
        println("first initialisation property block that print $name")
    }

    val secondProperty = "Second property :: ${name.length}".also(:: println)

    init {
        println("Second property block that print ${name.length}")
    }


   fun disp(){
//       println("Mobile Model -- $model \n\t Mobile Price -- $price")
       print("\t Mobile MOdel -- $model \n")
       print("\t Mobile Price -- $price \n\n")
   }

}
fun main(){

//    TestMobile("JetBrains Kotlin")

    val mb = TestMobile("JetBrains Kotlin")
    mb.disp()

    mb.model = "Realme 5"
    mb.price = 15400.0F
    mb.disp()

    mb.model = "OnePlus 7pro"
    mb.price = 55500.0F
    mb.disp()





}