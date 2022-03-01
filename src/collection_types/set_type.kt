package collection_types

fun main(){
  setTest()
  mutableSetTest()
}

fun mutableSetTest(){

    val mySetInt = mutableSetOf<Int>(1, 2, 4, 5, 6, 7)
    val mySetInt1 = mutableSetOf<Int>(10, 20, 30)
    val myAnySet1 = mutableSetOf<Any>(2, 3, 4, 5, 7, "Rahul", "Ajay", 'F')

    print("\t Mutable set \n")
    println(mySetInt)
    println(myAnySet1)

    print("\t add() and addAll() method \n")

    mySetInt.add(9)
    println(mySetInt)

    mySetInt.addAll(mySetInt1)
    println(mySetInt)

    print("\t Remove Set \n")
    mySetInt.remove(9)
    println(mySetInt)
    mySetInt.removeAll(mySetInt1)
    println(mySetInt)

    print("\n")

    val mySetInt3 = mutableSetOf<Int>(2, 6, 4, 29, 15, 34)
    val mySetInt4 = mutableSetOf<Int>(1, 2, 4, 5, 8)
    val mySetInt5 = mutableSetOf<Int>(2, 4, 6)

    println(mySetInt3.contains(29))
    println(mySetInt3.containsAll(mySetInt4))
    println(mySetInt4.containsAll(mySetInt5))
    println(mySetInt3.containsAll(mySetInt5))

    if (mySetInt5.isEmpty()){
        println("\t myset is empty not contain any element")
    }
    else{
        println("\t myset is not empty contain any element")
    }

    if (mySetInt5.any()){
        println("\t myset contain one or more element")
    }
    else{
        println("\t myset contain no any element")
    }

   println(mySetInt3.first())
//   println(mySetInt3.indexOf(2))

    println(mySetInt.drop(3))


    print("\n")

    val mySetInt6 = hashSetOf<String>("XYZ", "ABC", "PQR")
    println(mySetInt6)

    print("\n")

    val numbers = setOf("one", "two", "three")

    println(numbers union setOf("four", "five"))
    println(setOf("four", "five") union numbers)

    println(numbers intersect setOf("two", "one"))
    println(numbers subtract setOf("three", "four"))
    println(numbers subtract setOf("four", "three"))

    print("\n")


    val list1 = listOf(1, 1, 2 ,3, 5, 8, -1)
    val list2 = listOf(1, 1, 2, 2 ,3, 5)
    println(list1 intersect list2) // result on two lists is a Set
    println(list1 union list2)     // equal elements are merged into one


}


fun setTest(){
    val intSet = setOf<Int>(2, 3, 5, 8, 23)
    val strSet = setOf<String>("ABC", "XYZ", "PQR")
    val anySet1 : Set<Any>  = setOf(10, 20, 30, "ABC", "XYZ", "M", 30.25)
    print("\t ------ Integer Set ------ \n")

    for(element in intSet){
        println(element)
    }

    print("\t ------ String Set ------ \n")

    for (element in strSet){
        println(element)
    }

    print("\t ------ All the Set ------ \n")

    for (element in anySet1){
        println(element)
    }

    println(anySet1.contains('M'))
    println(intSet.contains(2))
    println(anySet1.contains(intSet))
    println(anySet1.isEmpty())
    println(intSet.isNotEmpty())

    print("\n")

   println(intSet.drop(2))

   println(strSet.elementAt(2))
   println(anySet1.elementAtOrNull(3))

   print("-------------------------------------------------------------- \n")
}
