package o


import l.Square

abstract class Shape {
    fun confessColour(){
        when {
            this is Rectangle -> {
                println("Rectangle")
            }
            this is Circle -> {
                println("Circle")
            }
            this is Square -> {
                println("Square")
            }
        }

    }
}