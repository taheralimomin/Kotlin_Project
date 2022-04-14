package modifiers

class Test{

//    val no = 10
    fun getName(name : String){
        println(name)
    }
}
internal class Mode {
    internal val no1 = 20
    internal fun show(){
        println("Internal Variable value of $no1")
        println("Internal Modifier to modules")
    }
}
fun main(){
    val obj2 = Mode()
    obj2.show()
}