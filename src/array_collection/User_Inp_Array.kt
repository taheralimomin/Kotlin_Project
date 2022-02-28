package array_collection

import java.util.*

// user input array

fun main(){

    userInputArray()
}
fun userInputArray(){
//    print("Enter your Number -----> ")
//    val num = readLine()!!.toInt()
//
//    println("Enter the student name ------> ")
//    val students = Array(num) { readLine()!!}
//
//    for (student in students){
//        println(student)
//    }

    print("Enter your Number ------> ")
    val no = readLine()!!.toInt()

    println("Enter your name ----->")
    val names = Array(no) { readLine()!!}

//    for (name in names){
//        println(name)
//    }

    println(Arrays.toString(names))

    print("\n\n")

    print("Enter the total number ----->")
    val num = readLine()!!.toInt()

    println("Enter the number in array ----> ")
    val no1 = Array(num) { readLine()!!.toInt()}

    println(Arrays.toString(no1))

}
