package es.uah.matcomp.mp.e1.ejerciciosclases;

public class Circle {
    private double radius;

    // Constructors (overloaded)
    /** Constructs a Circle instance with default value for radius */
    public Circle() { // 1st (default) constructor
        radius = 1.0;
    }

    /** Constructs a Circle instance with the given radius */
    public Circle(double radius) {
        this.radius = radius;
    }

    /** Returns the radius */
    public double getRadius() {
        return radius;
    }

    /** Sets the radius to the given value */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /** Returns the area of this Circle instance */
    public double getArea() {
        return radius*radius*Math.PI;
    }

    /** Returns el perimeter of this Circle instance */
    public double getCircumference() {
        return 2*radius*Math.PI;
    }

    public String toString() {
        return "Circle[radius=" + radius + "]";
    }

}
