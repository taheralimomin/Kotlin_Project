fun main() {

    println("Enter your Radius ---->")
    val radius:Int = Integer.valueOf(readLine())
    val pi = 3.14

    val area = 4 * pi * radius * radius
    val volume = (4 / 3) * pi * radius * radius * radius

    println("find the Area of $area and Volume find the $volume ")

}
