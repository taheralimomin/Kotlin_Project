// Kilometer convert to meter feet inch

fun main(args : Array<String>){

    print("Enter range of the kilometer ------>> ")
    val km : Int = Integer.valueOf(readLine())

    val meter : Int = km * 1000
    val feet : Double = km * 3280.84
    val inch : Double = km * 39370.1

    println("Range of kilometer $km find the Meter $meter Feet $feet and inches $inch")



}