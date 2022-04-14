package modifiers

import function_kt.sum

open class One{
    val a : Int = 10;
}
class Two : One(){
    val b : Int = 20;
    var sum : Int = 0;
    fun total(){
         sum = a + b;
    }
    fun show(){
        println("First Value ---> $a");
        println("Second Value ---> $b");
        println("Total Value ---> ${sum(10, 20)}");
    }
}
fun main(){
    val obj1 = Two()
    obj1.total()
    obj1.show()
}
