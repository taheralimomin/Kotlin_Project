package control_Flow

fun main(){
    print("Enter your number -->")
    val x : Int = Integer.valueOf(readLine())



    when(x){
        1 -> println("\t one \n")
        2 -> println("\t two \n")
        3 -> println("\t three \n")
        4 -> println("\t four \n")
        5 -> println("\t five \n")
    }

//    when(x) {
//        in 1..7 -> {
//            println(" \t Monday \n")
//            println("\t Tuesday \n")
//            println("\t Wednesday \n")
//            println("\t Thursday \n")
//            println("\t Friday \n")
//            println("\t Saturday \n")
//            println("\t Sunday \n")
//        }
//    }

//    print("\t\t !! Note :- Days Name First letter capital \n")
     print("Enter the Today name ----->>")
    val str1 = readLine()

    when(str1.toString()){
       "monday", "tuesday","wednesday","thursday" ->  println("\t Working Day \n")
       "friday" -> println("\t Half Day \n")
        "sunday", "saturday" -> println("\t Holiday \n")
    }
}