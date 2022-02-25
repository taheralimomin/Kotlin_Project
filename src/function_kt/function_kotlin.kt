package function_kt

fun main(args : Array<String>){

//    println(" Addition is ${sum(10, 20)}")
// sum(10,20)

    val result = sum(10, 20)
    println(" Total is $result ")

   val size : Unit = max(10,20)

//    println("double value are ${double(10)}")


    val total = double(10)
    println("Total of double $total")

    val adds = add()
    println("Add the value $adds")

    val mul = multi()
    println(mul)



}




// user defined function




//fun sum(a : Int, b : Int): Int {
////    println(a + b)
//    return a + b
//}
fun sum(a : Int , b : Int):Int = a + b
fun max(no1 : Int , no2 : Int) {
    if (no1 > no2) println("Max is $no1")
    else println("Max is $no2")
}

fun double(x : Int ):Int{
    return 2 * x
}
// function without parameter

fun add() : Int{
    val x : Int = 10
    val y : Int = 20

    return (x + y)
}
fun multi(): String {
    val p = 10
    val q = 20

    return ("Multiplication ${p * q}")
}

// function with parameter

