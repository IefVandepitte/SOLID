package o

class AreaCalculator : ShapeCalculator {


    override fun calculateArea(shapes : MutableCollection<Shape>) : Unit {
        var area = 0
        var isRectangle = false
        for (rectangle in shapes){
            if (rectangle !is Rectangle){
                println("Cannot  use Rectangle logic on ${rectangle::class.simpleName}")
            } else{
                isRectangle = true
                area += rectangle.height * rectangle.width
            }
        }
       if(isRectangle) println("The calculated area is : $area")
    }

}