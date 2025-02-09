package es.uah.matcomp.mp.el1.eja.e1;

/**
 * The Circle class models a circle with a radius and color.
 */
public class Circle { // Save as "Circle.java"
    // private instance variable, not accessible from outside this class
    private double radius;

    private String color;


    // Constructors (overloaded)
    /** Constructs a Circle instance with default value for radius and color */
    public Circle() { // 1st (default) constructor
        radius = 1.0;

        color = "red";

    }

    // Instance variable
    /** Constructs a Circle instance with the given radius and default color */
    public Circle(double radius) {
        this.radius = radius; // "this.radius" refers to the instance variable
// "radius" refers to the method's parameter
        color = "red";
    }

    // 3rd constructor to construct a new instance of Circle with the given radius and color
    public Circle (double radius, String color) {
        this.radius = radius;

        this.color = color;
    }


    /** Returns the radius */
    public double getRadius() {
        return radius;

    }


    /** Returns the area of this Circle instance */
    public double getArea() {
        return radius*radius*Math.PI;
    }

    // Getter for instance variable color
    public String getColor() {
        return color;

    }

    /** Sets the radius to the given value */
    public void setRadius(double radius) {
        this.radius = radius; // "this.radius" refers to the instance variable
    // "radius" refers to the method's argument
    }

    // Setter for instance variable color
    public void setColor(String color) {
        this.color = color;

    }
}
