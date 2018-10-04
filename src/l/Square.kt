package l

import o.Rectangle
import o.Shape

/**
 * This class represents a square. In mathematics, a Square is a Rectangle. Indeed it is a
 * specialization of a rectangle. The "is a" makes you want to model this with inheritance.
 * However if in code you made Square derive from Rectangle, then a Square should be
 * usable anywhere you expect a Rectangle. This makes for some strange behavior.
 */
class Square(var base: Int) : Shape() {


}