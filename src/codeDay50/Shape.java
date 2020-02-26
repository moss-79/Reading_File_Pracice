package codeDay50;
/*
*Task 2
		Create an Interface called Drawable
				it has draw method
		Create an abstract class called Shape
		it implements Drawable interface
		it has 2 fields :  String name , double area
		abstract method calculateArea();
		Create 2 concrete Shape classes called
				Square
					field : length
					instance methods : (implement all abstract methods)
					toString method
				Cirlce
					field : radius
					instance methods : (implement all abstract methods)
					toString method
 */

public abstract class Shape implements Drawable {

    String name;
    double area;

    public Shape(String name) {
        this.name = name;
    }

    public abstract void calculateArea();
}
