package array_collection

import java.util.*

fun main(){
   arr1()
   arr2()
   arr3()
   arr4()
}

// user input array


// Array create Built - in Method

fun arr4(){

    val no = intArrayOf(10, 20, 30, 40, 50)
    println(Arrays.toString(no))

    print("\n")

    for (n in no){
        println(n)
    }

    val gender = charArrayOf('M', 'F')
    println(Arrays.toString(gender))

    print("\t\n---------------------------------------------------------------------------\n")
}




// Array constructor

fun arr3(){

    print("\t\n---------------------------------------------------------------------------\n")

    val id = Array(5, {i -> i * 2})
    for (i in id){
        println(i)
    }

    print("\t\n---------------------------------------------------------------------------\n")
}








fun arr2(){
    val names = arrayOf<String>("Jhon", "Smith", "Rahul", "Sonam")

    print("\t\n---------------------------------------------------------------------------\n")

// loop their with index

    for (name in names){
        println(name)
    }

    print("\n")

    for (i in names.indices){
        println(i)
    }

    print("\n")

    for (i in names.indices){
        println("$i ---> ${names[i]}")
    }

    println(" Size of array ${names.size}")

    print("\n")

    val s = names.size
    for (i in 0 until s){
        println("$i = ${names[i]}")
    }

    print("\n")

// foreach use in array
    names.forEach { name -> println(name) }


    print("\n")

    print("\t\n---------------------------------------------------------------------------\n")
}



fun arr1(){
    val data = arrayOf<String>("Java", "Kotlin", "Asp.Net", "C/C++", "Python")

    print("\t\n---------------------------------------------------------------------------\n")

    println(Arrays.toString(data))
   for (item in data){
       println(item)

   }

//    data[4] = "VB.Net"

    print("\n")

// set method in array
    data.set(2, "VB.Net")

    for(items in data){
        println(items)
    }

// get method in array
  print("\n")

//  val dt = data[2]
//  println(dt)

  val dt1 = data.get(4)
  println(dt1)

    print("\t\n---------------------------------------------------------------------------\n")
}