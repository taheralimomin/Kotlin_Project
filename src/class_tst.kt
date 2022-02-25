fun main(args : Array<String>){

    println("Kotlin Programing");

    val testName = TestDemo();

    testName.name = "James Gosling";

    println("Testing Name is : ${testName.name} ");

    var testYear = TestDemo();

    testYear.no = 2022;

    println("Testing Year : ${testYear.no}")

    var fname = FirstDemo()

    fname.name = "Jhon Smith"

    println("First Name is : ${fname.name}")


    var no1:Int = 70
    var no2 : Int = 45
    var max : Int = 0
    var result = no1 + no2
    println("The addition operation $no1 and $no2  Result is $result ")


    var taher = TestDemo()
    taher.name = "Khatasiya"
//    println(taher.name)
    println("Lastname is : $taher.name")

    if(no1 > no2)
        max = no1
    else
        max = no2

    println("Maximum Number of : $max")

    var str1:String = "Sonam"
    var str2:String = "sonam"

    if(str1.equals(str2, true))
        println("String are same")
    else
        println("String are not same")
// null Handling
    var str : String ? = null
    var kotlin = TestDemo()
    println(kotlin.name?.length)




}