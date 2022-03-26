package inheritance_kotlin

// calling the super class implementation

open class Rectangle{
    open fun draw(){
        println("Drawing the Rectangle")
    }
    val borderColor : String get() = "blue"
}

class FilledRectangle : Rectangle() {
    override fun draw() {
        val filler = Filler()
        filler.drawAndFill()
    }

    inner class Filler {
        fun fill() {
            println("Filling")
        }

        fun drawAndFill() {
            super@FilledRectangle.draw()
            fill()
            println("Draw a fill rectangle with color ${super@FilledRectangle.borderColor}")
        }
    }
}


// property overriding

open class Birds{
    open var color = "Black"
    open fun fly(){
        println("Bird is flying...")
    }
}


class Parrot : Birds(){
    override var color = "Green"
    override fun fly() {
        println("parrot is flying...")
    }
}

class Duck : Birds(){
    override var color: String = "White"
    override fun fly() {
        println("duck is flying...")
    }
}


fun main() {
    val fr = FilledRectangle()
    fr.draw()

    val pr = Parrot()
    pr.fly()
    println(pr.color)

    val dc = Duck()
    dc.fly()
    println(dc.color)
}