package es.uah.matcomp.mp.e1.ejerciciosclases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void getLength() {
        Rectangle r = new Rectangle();
        assertEquals(1.0,r.getLength(),"La longitud deberia ser 1.0");
    }

    @Test
    void setLength() {
        Rectangle r = new Rectangle();
        r.setLength(2.0f);
        assertEquals(2.0,r.getLength(),"La longitud deberia ser 2.0");
    }

    @Test
    void getWidth() {
        Rectangle r = new Rectangle();
        assertEquals(1.0,r.getWidth(),"El ancho deberia ser 1.0");
    }

    @Test
    void setWidth() {
        Rectangle r = new Rectangle();
        r.setWidth(2.0f);
        assertEquals(2.0,r.getWidth(),"El ancho deberia ser 1.0");
    }

    @Test
    void getArea() {
        Rectangle r = new Rectangle(1.0f,1.0f);
        assertEquals(1.0,r.getArea(),"El area deberia ser 1.0");
    }

    @Test
    void getPerimeter() {
        Rectangle r = new Rectangle(1.0f,1.0f);
        assertEquals(4.0,r.getPerimeter(),"El perimetro deberia ser 1.0");
    }

    @Test
    void testToString() {
        Rectangle r = new Rectangle();
        assertEquals("Rectangle[length=" + 1.0 + " width " + 1.0 + "]", r.toString(),"El mensaje deberia ser : Rectangle[length= 1.0 width= 1.0]");

    }
}