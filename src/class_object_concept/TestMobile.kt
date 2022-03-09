package class_object_concept

class TestMobile {

   var model : String = "Samsung note5"
   var price : Float = 13500.00F

   fun disp(){
//       println("Mobile Model -- $model \n\t Mobile Price -- $price")
       print("\t Mobile MOdel -- $model \n")
       print("\t Mobile Price -- $price \n\n")
   }

}
fun main(){
    val mb = TestMobile()
    mb.disp()

    mb.model = "Realme 5"
    mb.price = 15400.0F
    mb.disp()

    mb.model = "OnePlus 7pro"
    mb.price = 55500.0F
    mb.disp()



}