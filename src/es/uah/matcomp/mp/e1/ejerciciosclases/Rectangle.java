package es.uah.matcomp.mp.e1.ejerciciosclases;

public class Rectangle {
    private float length;
    private float width;

    // Constructors (overloaded)
    /** Constructs a Rectangle instance with default value for length and width */
    public Rectangle() {
        length = 1.0f;
        width = 1.0f;
    }

    /** Constructs a Rectangle instance with the given length and width */
    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    /** Returns the length */
    public float getLength() {
        return length;
    }

    /** Sets the length to the given value */
    public void setLength(float length) {
        this.length = length;
    }

    /** Returns the width */
    public float getWidth() {
        return width;
    }

    /** Sets the width to the given value */
    public void setWidth(float width) {
        this.width = width;
    }

    /** Returns the area of this Rectangle instance */
    public double getArea() {
        return length*width;
    }

    /** Returns el perimeter of this Rectangle instance */
    public double getPerimeter() {
        return 2*(length+width);
    }

    public String toString() {
        return "Rectangle[length=" + length + " width " + width + "]";
    }
}
