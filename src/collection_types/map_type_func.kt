package collection_types

fun main(){
    mapTypes()
    hashMapType()
}

fun hashMapType(){

    print('\n')

    val myHashMap1 : HashMap<Int, String> = hashMapOf(1 to "Akasha", 2 to "Praveen", 3 to "Manoj", 4 to "Akasha")
    println(myHashMap1)

    for (key in myHashMap1.keys){
        println("$key --- ${myHashMap1[key]}")
    }

//    hashmap initial capacity

    print("\n")

    val myHashMap2 : HashMap<String, String> = HashMap<String, String>(3)
    myHashMap2.put("Name", "Praveen")
    myHashMap2.put("City", "New Bombay")
    myHashMap2.put("Department", "Android Development")

    for (key in myHashMap2.keys){
        println("$key --- ${myHashMap2[key]}")
    }

    print("\n")
    for (key in myHashMap2.keys){
        println("$key ---- ${myHashMap2.get(key)}")
    }

    myHashMap2.put("Hobbies" , "Traveling")
    println("HashMap Size --- ${myHashMap2.size}")

    print("\n")
    println(myHashMap1)

    myHashMap1.replace(1, "Ashu")
    for (key in myHashMap1.keys){
        println("$key ---- ${myHashMap1[key]}")
    }

    print("\n")

    println(myHashMap1.containsKey(2))
    println(myHashMap1.containsValue("Rahul"))

//   println(myHashMap2)

    println("\t\t Hashmap data \n $myHashMap1")
    print("\t clear method \n")
//    println(myHashMap1.clear())
    myHashMap1.clear()
    println(myHashMap1)

    print("\n")

// hashMapOf in kotlin
    print("\t\t hashMapOf use hashmap \n")

    val myHashMapOf :HashMap<Int, String> = hashMapOf<Int, String>(1 to "ABC", 2 to "PQR", 3 to "XYZ")
    val myHashMapOfStr : HashMap <String, String> = hashMapOf<String, String>("name" to "jay")
    myHashMapOfStr.put("city", "patan")
    myHashMapOfStr.put("department", "android developer")
    myHashMapOfStr.put("hobby", "traveling")
    val myHashMapAny : HashMap<Any, Any> = hashMapOf<Any, Any>("one" to 1, 2 to "Jay", "key3" to 23.45, "Charc" to 'F')

    print("\t\t  Traverse of HashMapOf \n")

    for (key in myHashMapOf.keys){
        println("$key -------- ${myHashMapOf[key]}")

    }

    print("\n")

    for (key in myHashMapOfStr.keys){
        println("$key ---- ${myHashMapOfStr[key]}")
    }

    print("\n")

    for (key in myHashMapAny.keys){
        println("$key ---- ${myHashMapAny[key]}")
    }

}





fun mapTypes(){

    val map1 = mapOf<String, String>("key1" to "ABC", "key2" to "XYZ", "key3" to "PQR")
     println(map1)

    val myMap1 = mapOf<Int, String>(1 to "Sonam", 2 to "Rahul", 3 to "Manoj")
    println(myMap1)

    for (key in myMap1.keys){
        println("$key -----> ${myMap1.get(key)}")
    }

    println(myMap1.getValue(2))
    println(myMap1.contains(3))
    println(myMap1.containsKey(2))
    println(myMap1.containsValue("jay"))
    println(myMap1.getOrDefault(4, "Jay"))


    print("\n")
//  asIterable() method

    val myMap2 : Map<Int, String> = mapOf<Int, String>(1 to "Jay", 2 to "ABC", 3 to "Manoj", 4 to "Sonam")
    println(myMap2)

    for (itr in myMap2.asIterable()){
        println("Key ---> ${itr.key} \t Value -----> ${itr.value}")
    }

// iterator() method

    print("\n")

    for (itr in myMap2.iterator()){
        println("Key ---->> ${itr.key} \t Value ----->> ${itr.value} ")
    }

    print("\n")

//    minus () method

    for (ms in myMap2.minus(4)){
        println(myMap1[ms.key])
    }

}