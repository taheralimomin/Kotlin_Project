package collection_types

fun main(){

    val list1 = mutableListOf("ABC", "PQR", "STU", "JKL", "MNP")
    println(list1)

    list1.add(0, "Jayesh")
    println(list1)
//    retrieving element by index in list

    println(list1.get(0))
    println(list1.getOrNull(2))
    println(list1.elementAt(2))
    println(list1.first())
    println(list1.last())

    print("\n")

//    Linear Search

    println(list1.indexOfFirst { it == "PQR" })
    println(list1.indexOfLast { it != "PQR" })

    print("\n")

//    Binary Search
    list1.sort()
    println(list1)
    println(list1.binarySearch("PQR"))
    println(list1.binarySearch("STU"))
    println(list1.binarySearch("PQR", 0 ,2))

    print("\n")

// retrieve list parts
    val num = (0..10).toList()
    println(num.subList(2, 8))


// find element position
// 1. Linear Search

  val list2 = mutableListOf(1,2,3,4,2,5,6)
  println(list2.indexOf(2))
  println(list2.lastIndexOf(2))
  println(list2.indexOfFirst { it > 2 })
  println(list2.indexOfLast { it % 2 == 1 })

    print("\n")

// 2. Binary Search
  list1.sortDescending()
  println(list1)

    print("\n")

  list1.sort()
  println(list1)

  list1.add(4, "Jay")
  println(list1)

  list1[2] = "XYZ"
  println(list1)

//     update list
//    list2.fill(3)
//    println(list2)

//     remove list

    print("\t\t Remove List Method \n")

    println(list2)

    list2.remove(6)
    println(list2)

    println(list1)
    list1.removeAt(4)
    println(list1)


    print("\n")

    val list3 = mutableListOf(10, 20, 30, 40, 50)
    println(list3)

    list3.removeFirstOrNull()
    println(list3)

    list3.removeLastOrNull()
    println(list3)

    list3.removeAll(listOf(30))
    println(list3)


//   sorting in the list
    print("\n")

    val list4 = mutableListOf(2, 6, 9, 33, 26, 4, 67, 44, 1)
    println(list4)

    list4.sort()
    println(list4)

   list4.sortDescending()
   println(list4)

//   list4.sortBy { it.compareTo(20)}
//    println(list4)

    list4.shuffle()
    println(list4)

   list4.reverse()
   println(list4)


//    user input list

    print("Enter the Number ----> ")
    val num1 = readLine()!!.toInt()

    println("Enter your elements in List ----->")
    val list5 = List(num1){readLine()!!.toInt()}
    println(list5)


}