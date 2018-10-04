import l.Square
import o.*
import s.Author
import s.book


/**
 * The main routine, which is the entry point to a Kotlin application.
 * You need to provide the correct letter to execute the code.
 */
fun main(args: Array<String>){

    val SOLID = args[0]
    when(SOLID){
        "S" -> {
            val jBook = book(Author("Jens Buysse"), "Inhoud van het boek", "Titel van het boek")
            val hBook = book(Author("Harm De Weird"))
        }
        "O" -> {
            val rec1 = Rectangle(5,10)
            val rec2 = Rectangle(3,4)
            val square = Square(3)
            val circle1 = Circle(2)
            val list1 : MutableList<Shape> = mutableListOf(circle1)
            var Calc: ShapeCalculator = CircleCalculator()
            Calc.calculateArea(list1)
            val list : MutableList<Shape> = mutableListOf(rec1,rec2, square)
            Calc = RectangleCalculator()
            Calc.calculateArea(list)
            Calc.calculateArea(list1)
        }
        "L" -> {
            var shape : Shape = Square(12)
            shape.confessColour()
            shape = Rectangle(1,2)
            shape.confessColour()
            shape = Circle(12)
            shape.confessColour()
        }
    }


}

