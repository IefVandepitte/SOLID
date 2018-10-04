import d.Manager
import d.Superworker
import d.Worker
import i.AndroidComponent
import i.DesktopComponent
import l.Square
import o.*
import s.Author
import s.book
import java.awt.LayoutManager2


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
        "I" -> {
            var android = AndroidComponent()
            android.swipe("swipe")
            android.touch("touch")
            android.validate()

            val desktop = DesktopComponent()
            desktop.mouseover("hover")
            desktop.validate()
        }
        "D" -> {
            val worker = Worker("Ief")
            val superWorker = Superworker("Super Ief")
            var manager1 = Manager(worker)
            manager1.manage()
            manager1.worker= superWorker
            manager1.manage()
            var manager2 = Manager(superWorker)
            manager2.manage()
        }
    }


}

