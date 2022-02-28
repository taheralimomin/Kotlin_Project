package collection_types

fun main(){
   listTestTypes()
   listItems()

}

fun listItems(){

     print("\n")

    val items = listOf("Parle", "Britannia", "Balaji", "Lays", "Bites", 10, "F")
    println("\t All Datatype  of the list \n $items ")
    println(items[1])
    println(items[3])
    println(items[5])
    println(items[2])

    print("\n")

    for (item in items){
        println(item)
    }

    for (i in items.indices){
        println("$i ---> ${items[i]}")
    }

    print("\n")

    val s = items.size
    for (i in 0 until s){
        println("$i ---> ${items[i]}")
    }

    print("\n")

    items.forEach{ item -> println(item) }

    print("\n")

    println(items)


    print("\n")

    println(items.size)
    println(items.get(4))




}

fun listTestTypes(){

    print("\n")

    val list1 = listOf("Sonam", "Rahul", "Manoj", 120, 34.56, "Rahul", 'M')
    println("All the value in List ---> $list1")

    val list2 = listOf<String>("ABC", "XYZ", "PQR", "STU")
    println("String Array --> $list2")

    val list3 = listOf<Int>(10, 20, 40, 50, 60)
    println("Integer Array -->$list3")

    val list4 = listOf<Char>('A', 'B', 'C', 'D')
    println("Character Array --> $list4")

    val list5 = listOf<Double>(10.5, 20.5, 30.5, 40.5, 50.5)
    println("Float or Double Array --> $list5")

    val list6 = listOf<Boolean>(true, false)
    println("Boolean Array --> $list6")

}