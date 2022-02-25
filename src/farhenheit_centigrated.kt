// Fahrenheit into centigrade

fun main(args : Array<String>){
    print("Enter temperature of fahrenheit ----->>> ")
    val far : Int = Integer.valueOf(readLine())

    val centi : Double = (far - 32)/1.8
    println("fahrenheit $far into centigrade $centi")

}
