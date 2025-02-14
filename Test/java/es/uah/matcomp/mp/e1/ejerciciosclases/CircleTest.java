package es.uah.matcomp.mp.e1.ejerciciosclases;

import es.uah.matcomp.mp.e1.ejerciciosclases.Circle.Circle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void getRadius() {
        Circle c = new Circle(1.1);
        assertEquals(1.1, c.getRadius(),"El radio deberia ser 1.1");
    }

    @Test
    void setRadius() {
        Circle c = new Circle(1.1);
        c.setRadius(6.9);
        assertEquals(6.9, c.getRadius(),"El radio deberia ser 6.9");
    }

    @Test
    void getArea() {
        Circle c = new Circle();
        assertEquals(Math.PI, c.getArea(),"El area deberia ser 3.141592653589793");
    }

    @Test
    void getCircumference() {
        Circle c = new Circle(0.5);
        assertEquals(Math.PI, c.getCircumference(),"La circunferencia deberia ser 3.141592653589793");
    }

    @Test
    void testToString() {
    Circle c = new Circle(0.5);
    assertEquals("Circle[radius=" + 0.5 + "]", c.toString());
    }
}