import java.util.*

fun main() {
    val num = arrayOf(1,2,3,4,5)
    val firstno = num[2]
    val lastno = num[num.size - 1]
    println(firstno)
    println(lastno)

//    array of constructor
    val asc = IntArray(5, { i -> i * 2 })
    println(asc)

//    type conversion

    val x = 100
    val y: Float = x.toFloat()
    println(y)

    val a = 23.658686
    val b: Float = a.toFloat()
    println(b)

//    two types of string
//    escape string
    val text = "Hello Kotlin Programme \t Hello world \n"
    print(text)

//    raw string
    val text1 = """
            Kotlin programing using Jvm and android sdk version
            kotlin programing tutorial
    """.trimIndent()
    println(text1)

//    string template
    val no = 100
    println(" The number of $no ")

//    character in kotlin
    val c : Char
    c = 'E'
    println(c)

//    array and string
    val arr1 = arrayOf(1,2,3,4,5)
    println(Arrays.toString(arr1))

    val arr2 = IntArray(5,{i -> i * 2 + 3 })
    println(Arrays.toString(arr2))

    val arr3 = arrayOf(1,2,3,4,5)
    println(arr3[3])
    arr3[4] = 75
    arr3[2] = 15
    println(arr3[4])
    println(Arrays.toString(arr3))


    val arr4 = arrayOf(1,2,3,4,5)
    println(arr4.get(1))
    arr4.set(0, 5)
    val arr5 = arr4.plus(6)
    println(Arrays.toString(arr4))
    println(Arrays.toString(arr5))
    println(arr4.first())
    println(arr5.last())
    println(arr4.indexOf(3))


    val arr6 = arrayOf(1,2,3,5,8,4,7)
    println(Arrays.toString(arr6))
    println("there are so many ${arr6.count()} elements the array")
    val Evens = arr6.count {it % 2 == 0}
    println("There are $Evens even number in the array")
    val Odds = arr6.count { it % 2 != 0 }
    println("There are $Odds odd number in the array")
    val sortedNumbers = arr6.sortedArray()
    println(Arrays.toString(sortedNumbers))
    val descSortedNo = arr6.sortedArrayDescending()
    println(Arrays.toString(descSortedNo))
    val reverseNo = arr6.reversedArray()
    println(Arrays.toString(reverseNo))

//    two dimensional and multi dimensional Array
    print("\t\n Two OR Multi Dimensional Array \n")
    val arr7 = arrayOf(intArrayOf(1,2),
    intArrayOf(3,4),
    intArrayOf(5,6),
    intArrayOf(7,8),
    intArrayOf(9,12))
    println(Arrays.deepToString(arr7))

}