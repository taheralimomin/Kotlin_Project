package collection_types

fun main(){
   mapDict()
   mapDictMethod()
}

fun mapDictMethod(){

//    filter map or Dictionary

    val dict2 = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key10" to 10, "key11" to 11)
    val filteredMap = dict2.filter { (key, value) -> key.endsWith("1") &&  value > 10 }
    val filteredMap1 = dict2.filter { (key, value) -> key.startsWith("key1") && value > 5 }
    println(filteredMap)
    println(filteredMap1)

    print("\n")

    val filteredKeyMap = dict2.filterKeys { it.endsWith("1") }
    val filteredValueMap = dict2.filterValues { it < 10 }
    println(filteredKeyMap)
    println(filteredValueMap)

//    plus, minus and pair operator

    print("\n")

    val dict3 = mapOf("key1" to 1, "key2" to 2, "key3" to 3)
    println(dict3 + Pair("key4", 4))
    println(dict3 + Pair("key1", 10))
    println(dict3 + Pair("key1" , 11))
    println(dict3 + mapOf("key5" to 55, "key1" to 111))
    println(dict3 - "key1")
    println(dict3 - listOf("key2", "key4"))

// add and update in Map

    print("----------------------------------------------------------------------------------\n")

    val dict4 = mutableMapOf("key1" to 1, "key2" to 2)
    dict4.put("key3", 3)
    println(dict4)
    dict4.putAll(setOf("key4" to 4, "key5" to 5))
    println(dict4)

    val previousValue = dict4.put("key1", 11)
    println("value associated with 'key1', before: $previousValue, after: ${dict4["key1"]}")
    println(dict4)

    dict4["key7"] = 7
    dict4 += mapOf("key8" to 8, "key9" to 9)
    println(dict4)

//    remove map or dictionary

    dict4.remove("key9")
    println(dict4)
    dict4.remove("key8", 8)
    println(dict4)

    print("\n")

    val dict5 = mutableMapOf("one" to 1, "two" to 2, "three" to 3, "threeAgain" to 3)
    dict5.keys.remove("one")
    println(dict5)
    dict5.values.remove(3)
    println(dict5)

    print("\n")

    val dict6 = mutableMapOf("one" to 1, "two" to 2, "three" to 3)
    dict6 -= "two"
    println(dict6)

    dict6 -= "five"
    println(dict6)



}

fun mapDict(){

    val dict1 = mapOf("one" to 1, "two" to 2, "three" to 3)
    println(dict1)

    println(dict1.keys)
    println(dict1.values)
    println(dict1.get("one"))
    println(dict1["two"])
    println(dict1.getOrDefault("four", 4))
    println(dict1["four"])

    print("\n")

    for (key in dict1.keys){
        println(key)
    }
    for (value in dict1.values){
        println(value)
    }

    for (key in dict1.keys){
        println("$key = ${dict1[key]}")
    }

//    for (value in dict1.values){
//        println("""$value ---> ${dict1[value]}""")
//    }

    println(dict1.size)


}