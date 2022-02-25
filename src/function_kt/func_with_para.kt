package function_kt

fun main(){
   disp(10,20)
   val mul = multi(20, 45)
   println(mul)
   val max = maxVal(10, 20)
   println(max)

   val totalVal = nmArgVal(t = 30, s = 40)
   println(totalVal)
}

// function with parameter

fun disp(p : Int , q : Int){
    val a : Int = p
    val b : Int = q

    val result = a + b

    println("Total of the value $result")
}
fun multi(x : Int, y : Int): String {
    return ("\t Multiplication of the value ${x * y} \n")
}


// function with default argument
fun maxVal(no1 : Int, no2 : Int, no3 : Int = 25): String {
    return if (no1 > no2) {
        ("Maximum number of $no1")
    }
    else if (no2 > no3){
        ("Maximum number of $no2")
    }
    else{
        ("Maximum number of $no3")
    }

}

// function with named argument
fun nmArgVal(s : Int, t : Int): Int {
   println("\t First value of S No = $s \n")
   println("\t Second value of T No = $t")
  return (s + t)
}


