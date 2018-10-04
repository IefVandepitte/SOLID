import com.sun.org.apache.bcel.internal.generic.NEW
import o.AreaCalculator
import o.Rectangle
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
            val list : MutableList<Rectangle> = mutableListOf(rec1,rec2)
            val areaCalc = AreaCalculator()
            areaCalc.calculateArea(list)
        }
    }


}

