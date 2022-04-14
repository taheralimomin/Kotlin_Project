package modifiers

private class Test1{
    private val a = 10;
    fun show(){
        println("Private Access Modifier")
        println("Private Variable -- $a")
    }
}
fun main(){
    val obj1 = Test1()
    obj1.show()
}