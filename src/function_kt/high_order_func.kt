@file:Suppress("NOTHING_TO_INLINE")

package function_kt


fun main() {
    hOFunc(20, 40, ::add1)
    hOFun1(70, 40, ::max2)
    add2()
    hOFunc2(90, 85) { x: Int, y: Int -> x + y }
    anoFunc()
    nullFunc3()
    chNFunc1()
//    inline function call
//    inLineFunc1({println("\t\t Calling the inline function ")}, { println("\t\t Calling the notInLine function ")})
    test(
        "\t JetBrains",
        fun() {
            println("\t\t body() function call")
            return
        },
        fun(){
            println("\t\tblock() function call")
            return
        }
    ) {
            println("\t\t foo() function call")
            return@test
        }
}

fun add1(a: Int, b: Int): Int {
    return (a + b)
}

fun hOFunc(a: Int, b: Int, callback: (Int, Int) -> Int) {
    println(callback(a, b))
}

fun max2(x: Int, y: Int): String {
    return if (x > y)
        ("\t Max of the value $x \n")
    else
        ("\t Max of the value $y \n")
}

fun hOFunc1(x: Int, y: Int, callback: (Int, Int) -> Int) {
    println(callback(x, y))
}

// lambda function or expression

fun add2() {
    val total = { no1: Int, no2: Int -> no1 + no2 }
    println(total(10, 20))
}

fun hOFunc2(x: Int, y: Int, callback: (Int, Int) -> Int) {
    println(callback(x, y))
}

// anonymous function

fun anoFunc() {

    val disp = fun() {
        println("\t\t Anonymous Function in Kotlin ")
    }
    disp()

    val sum = fun(p: Int, q: Int): Int {
        return p + q
    }
    println("\t\t Sum of the value ${sum(85, 74)} \n")

}

// Null safety in kotlin
fun nullFunc3() {

    val name1: String?
    name1 = "Rajesh Motiwala Surat"


    val name: String?
    name = "JetBrains kotlin"
    println(name)

    val strLength = name1.length
    println("\t Length of string first $strLength ")

    val strLength1 = name.length
    println("\t Length of String second $strLength1")

}

fun chNFunc1() {

// option : Check null in condition OR Safe call

    val str1: String?
    str1 = null
    val strLenChk = str1?.length ?: -1
    println(strLenChk)

// option 2 : the !! operator
// the not - null assertion operator (!!) thrown an exception if the value is null

//    var str2 : String? = "JetBrains"
//    str2 = null
//    val strLenChk1 = if (str2 != null) str2?.length else throw NullPointerException("Expression 'str1' must not be null")
//    println(strLenChk1)
}

// inline function
// non-inline function
// cross line

//inline fun inLineFunc1(myTest: () -> Unit, noinline notInLined:() -> Unit){
//    myTest()
//
//    notInLined()
//
//    println("\t\t\t code inside inline function ")
//}

inline fun <T> test(lock: T, body: () -> Unit, noinline block: () -> Unit, crossinline foo: () -> Unit) {

    object {
        val a : Int = 10
        val b : Int = 20
        val min = if (a < b){

            block()
            foo()
            println(lock)
        }
        else {
            println("It is Not less than B ")
        }
    }
     body()

}