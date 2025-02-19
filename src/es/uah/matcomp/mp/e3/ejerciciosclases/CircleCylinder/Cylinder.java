package es.uah.matcomp.mp.e3.ejerciciosclases.CircleCylinder;

public class Cylinder extends Circle { // Save as "Cylinder.java"
    private double height; // private variable

    // Constructor with default color, radius and height
    public Cylinder() {
        super(); // call superclass no-arg constructor Circle()
        height = 1.0;
    }

    // Constructor with default height, color but given radius
    public Cylinder(double radius) {
        super(radius); // call superclass constructor Circle(r)
        this.height = 1.0;
    }

    // Constructor with default color, but given radius, height
    public Cylinder(double radius, double height) {
        super(radius); // call superclass constructor Circle(r)
        this.height = height;
    }

    public Cylinder(double radius, double height, String color) {
        super(radius,color);
        this.height = height;
    }

    // A public method for retrieving the height
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // A public method for computing the volume of cylinder
// use superclass method getArea() to get the base area
    public double getVolume() {
        return getArea()*height;
    }

    @Override
    public String toString() { // in Cylinder class
        return "Cylinder: subclass of " + super.toString() // use Circle's toString()
                + " height=" + height;
    }
}
