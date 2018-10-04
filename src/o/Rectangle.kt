package o

/**
 * This class represents a rectangle.
 * Getters and setters have no needed setters and getters
 * To use a property, we simply refer to it by name, as if it were a field in Java.
 *
 * The open annotation on a class is the opposite of Java's final:
 * it allows others to inherit from this class.
 */
open class Rectangle (open var width: Int = 0 , open var height: Int = 0): Shape(){


}