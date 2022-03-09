package class_object_concept

class Account {

    var acc_no : Int = 0
    var name : String = ""
    var amount : Float = 0.toFloat()

    fun insert(ac : Int, nm : String, am : Float){
        acc_no = ac
        name = nm
        amount = am
    }

    fun disp(){
        println("\t Account Number -- $acc_no \n\t Name -- $name \n\t Amount Number -- $amount")
    }

    fun deposit(){

    }

    fun withdraw(){

    }
    fun checkBalance(){

    }



}
fun main(){

    Account()
    val acc = Account()
    acc.insert(952346, "Sonam", 10000F)
    acc.disp()


}