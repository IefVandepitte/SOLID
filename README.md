# SOLID

This repository contains the source code examples from the course Native Apps 1 (Android), taught at University College Ghent. 
It contains the examples of the course which do not abide the principles of the SOLID design pattern.

* Single Responsibility principle: The class book didn't abide to this principle; an author is not a responsiblity of a book hence changes to an author would mean that the class book would have to change now i can add an date of birth property to an author without having to change anything to a book.

* Open Closed Principle: The class Rectangle is now a subclass of the abstract class Shape, the class Circle is as well so now I can create a calculator interface which accepts an MutableList of Shape so i can pass rectangles as well as circles to the specialized calculators which implement the calculateArea method. The calculators can be changed at runtime as well.
