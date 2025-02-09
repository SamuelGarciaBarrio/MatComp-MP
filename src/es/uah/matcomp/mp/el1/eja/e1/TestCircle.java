package es.uah.matcomp.mp.el1.eja.e1;

/**
 * A Test Driver for the Circle class
 */
public class TestCircle { // Save as "es.uah.matcomp.mp.li.eja.e1.es.uah.matcomp.mp.el1.eja.e1.TestCircle.java"
    public static void main(String[] args) {
// Declare an instance of Circle class called c1.
// Construct the instance c1 by invoking the "default" constructor
// which sets its radius and color to their default value.
        Circle c1 = new Circle();
// Invoke public methods on instance c1, via dot operator.
        System.out.println("The circle has radius of "
                + c1.getRadius() + " an area of " + c1.getArea() + " and colour " + c1.getColor());
//The circle has radius of 1.0 and area of 3.141592653589793
// Declare an instance of class circle called c2.
// Construct the instance c2 by invoking the second constructor
// with the given radius and default color.
        Circle c2 = new Circle(2.0);
// Invoke public methods on instance c2, via dot operator.
        System.out.println("The circle has radius of "
                + c2.getRadius() + " an area of " + c2.getArea() + " and colour " + c2.getColor());
//The circle has radius of 2.0 and area of 12.566370614359172
// Declare an instance of class circle called c3.
// Construct the instance c3 by invoking the t constructor
// with the given radius and color.
        Circle c3 = new Circle(3.0,"pink");
        System.out.println("The circle has radius of "
                + c3.getRadius() + " an area of " + c3.getArea() + " and colour " + c3.getColor());
        Circle c4 = new Circle(); // construct an instance of Circle
        c4.setRadius(5.5); // change radius
        System.out.println("radius is: " + c4.getRadius()); // Print radius via getter
        c4.setColor("green"); // Change color
        System.out.println("color is: " + c4.getColor()); // Print color via getter
// You cannot do the following because setRadius() returns void, which cannot be printed
        // System.out.println(c4.setRadius(4.4));
    }
}