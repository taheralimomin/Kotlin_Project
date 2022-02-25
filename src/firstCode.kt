

fun main(){
     val text = TestDemo()
    text.name = "jhon Smith"
    print("First name is ${text.name} \n")

    val text1 = FirstDemo()
    text1.name = "Donald"
    print("Lastname is ${text1.name} \n ")

    val num = TestDemo()
    num.no = 250
    print("the number is ${num.no} \n")

//    control flow
//    if else Expression
//    print("Enter your number ---->")
//    var no1 :Int = Integer.valueOf(readLine())
//    print("Enter your number ----->")
//    var no2:Int = Integer.valueOf(readLine())
//
//
//    var result = if (no1 > no2){
//          println(" $no1 number is Maximum")
//    }
//    else{
//         println(" $no2 number is Maximum ")
//    }

//    if elseif else Expression

//    print("Enter your First Number ------> ")
//    val no1: Int = Integer.valueOf(readLine())
//    print("Enter your Second Number -----> ")
//    val no2:Int = Integer.valueOf(readLine())
//    print("Enter your Third Number ------->")
//    val no3:Int = Integer.valueOf(readLine())
//
//    if (no1 > no3){
//         print("\tMaximum number of $no1 \n")
//    }
//    else if(no3 > no2){
//        print("\t Maximum number of $no3 \n")
//    }
//    else{
//        print("\t Maximum number of $no2 \n")
//    }
//
//   val num1 = 100
//   val num2 = 200
//   val total = num1 + num2
//   println(total)
//
//   val fname = TestDemo()
//   fname.name = "Kotlin tutorial Edureka!"
//   println("your name is ${fname.name}")
//
////   when statement
//    print("Enter the Week of days ----> ")
//    val Week : Int = Integer.valueOf(readLine())
//
//    when(Week){
//        1 -> print("\t\n Monday \n")
//        2 -> print("\t\n Tuesday \n")
//        3 -> print("\t\n Wednesday \n")
//        4 -> print("\t\n Thursday \n")
//        5 -> print("\t\n Friday \n")
//        6 -> print("\t\n Saturday")
//        7 -> print("\t\n Sunday")
//        else -> {
//            println("\t\n Invalid Number \n")
//        }
//
//    }

//   val x : Int = 2
//    when (x) {
//        1 -> print("x == 1")
//        2 -> print("x == 2")
//        else -> {
//            print("x is neither 1 nor 2")
//        }
//    }




    // for loop expression

   for (i in 1..5)
       println(i)

   for (i in 10 downTo 0 step 3)
       println(i)

    val array = arrayOf('a','b','c')
    for (i in array.indices)
        println(array[i])

    for ((index, value) in array.withIndex()) {
        println("these are elements index $index and value $value")
    }

// while loop expression

    var j : Int = 0
    while (j < 4){
        println("These are value of $j")
        j++
    }

//  do while statement

    var i : Int = 1
    do {
        println("The value of increment in $i")
        i++
    } while (i <= 10)

//    print("Enter the value -----> ")
//    var x : Int = Integer.valueOf(readLine())
//    when (x){
//        1 -> println("0 or 10 enter value display the condition")
//        0,10 -> print(" x==0 or x==10 ")
//        else -> print("Invalid enter number !!!!!")
//    }


//   val n : Int = 6
//   val p : Int = 3
//   loop@ while (n in 1..5){
//       while (p in 6..10){
//         println("no = $n and $p")
//         if (p == 7)
//             break@loop
//       }
//
//   }


//    loop@ for (i in 1..100) {
//        for (j in 1..100) {
//            if ( i == j) break@loop
//        }
//    }

    for (i in 1..5){
        if (i == 3){
            break
        }
        println("number are $i")
    }

    loop@for (i in 1..5){
        for (j in 1..5){
            println("number of i = $i and j = $j")
            if (i == 2)
                break@loop
        }
    }


//   continue statement
//   for (i in 1..5){
//       println("number of i = $i")
//       if (j == 2)
//           continue
//       println("this line below if")
//   }
// continue using @labelname
    labelname@for (i in 1..5){
        for (j in 1..5){
            println("i = $i and j = $j")
            if (i == 2) {
                continue@labelname
            }
            println("this below it")
        }
    }

//    function in kotlin





}