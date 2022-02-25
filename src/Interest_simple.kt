fun main() {

    println("Enter the Total Principles ---->> ")
    val prince:Int = Integer.valueOf(readLine())
    println("Enter the total Repayments ---->> ")
    val repay:Int = Integer.valueOf(readLine())
    println("Enter total number of periods ---->> ")
    val no:Int = Integer.valueOf(readLine())

    val interest = (prince * repay * no) / 100
    println("Total Interest of repayment of periods $interest ")

//        interchange of the two value using kotlin
     print("Enter first value :: ")
    var a1 : Int = Integer.valueOf(readLine())
    print("Enter second value ::")
    var b1 : Int = Integer.valueOf(readLine())

    val temp = a1
    a1 = b1
    b1 = temp

    println("First $a1 Second $b1")
    
}