package o

import l.Square

class RectangleCalculator : ShapeCalculator {


    override fun calculateArea(shapes: MutableCollection<Shape>) {

        var area = 0
        var isRectangle = false
        for ( rectangle in shapes) {
            if (rectangle !is Rectangle && rectangle !is Square) {
                println("Cannot use Rectangle logic on ${rectangle::class.simpleName}")
            } else {
                if (rectangle is Rectangle){
                    area += rectangle.height * rectangle.width
                } else if ( rectangle is Square){
                    area += rectangle.base * rectangle.base
                }
                isRectangle = true

            }
        }
        if (isRectangle) println("The calculated area is : $area")
    }

}