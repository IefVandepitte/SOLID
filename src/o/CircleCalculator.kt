package o

class CircleCalculator : ShapeCalculator {

   override fun calculateArea(shapes: MutableCollection<Shape>) : Unit{
        var area = 0
        var isCircle = false

        for ( circle in shapes){
            if (circle !is Circle){
                println("Cannot use Circle logic on ${circle::class.simpleName}")
            } else{
                isCircle = true
                // area of circle is Pi times radius squared
                area += (Math.PI * circle.radius * circle.radius).toInt()
            }

        }
        if(isCircle)println("The calculated area is : $area")
    }



}