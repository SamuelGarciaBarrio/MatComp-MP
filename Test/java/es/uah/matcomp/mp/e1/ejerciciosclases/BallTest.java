package es.uah.matcomp.mp.e1.ejerciciosclases;

import es.uah.matcomp.mp.e1.ejerciciosclases.Ball.Ball;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class BallTest {

    @Test
    void getX() {
        Ball b = new Ball(1.1f, 2.2f, 10, 3.3f, 4.4f);
        assertEquals(1.1f,b.getX(),"La coordenada X deberia ser 1.1");
    }

    @Test
    void getY() {
        Ball b = new Ball(1.1f, 2.2f, 10, 3.3f, 4.4f);
        assertEquals(2.2f,b.getY(),"La coordenada Y deberia ser 2.2");
    }

    @Test
    void getRadius() {
        Ball b = new Ball(1.1f, 2.2f, 10, 3.3f, 4.4f);
        assertEquals(10,b.getRadius(),"El radio deberia ser 10");
    }

    @Test
    void getXDelta() {
        Ball b = new Ball(1.1f, 2.2f, 10, 3.3f, 4.4f);
        assertEquals(3.3f,b.getXDelta(),"La delta X deberia ser 3.3");
    }

    @Test
    void getYDelta() {
        Ball b = new Ball(1.1f, 2.2f, 10, 3.3f, 4.4f);
        assertEquals(4.4f,b.getYDelta(),"La delta Y deberia ser 4.4");
    }

    @Test
    void setX() {
        Ball b = new Ball(1.1f, 2.2f, 10, 3.3f, 4.4f);
        b.setX(0.0f);
        assertEquals(0.0,b.getX(),"La coordenada X deberia ser 0.0");
    }

    @Test
    void setY() {
        Ball b = new Ball(1.1f, 2.2f, 10, 3.3f, 4.4f);
        b.setY(0.0f);
        assertEquals(0.0,b.getY(),"La coordenada Y deberia ser 0.0");
    }

    @Test
    void setRadius() {
        Ball b = new Ball(1.1f, 2.2f, 10, 3.3f, 4.4f);
        b.setRadius(666);
        assertEquals(666,b.getRadius(),"El radio deberia ser 666");
    }

    @Test
    void setXDelta() {
        Ball b = new Ball(1.1f, 2.2f, 10, 3.3f, 4.4f);
        b.setXDelta(0.0f);
        assertEquals(0.0,b.getXDelta(),"La delta X deberia ser 0.0");
    }

    @Test
    void setYDelta() {
        Ball b = new Ball(1.1f, 2.2f, 10, 3.3f, 4.4f);
        b.setYDelta(0.0f);
        assertEquals(0.0,b.getYDelta(),"La delta Y deberia ser 0.0");
    }

    @Test
    void move() {
        Ball b = new Ball(1.1f, 0.0f, 10, 3.3f, 4.4f);
        b.move();
        assertEquals(4.4f,b.getX(),"La coordenada X deberia ser 4.4");
        assertEquals(4.4f,b.getY(),"La coordenada Y deberia ser 6.6");
    }

    @Test
    void reflectHorizontal() {
        Ball b = new Ball(1.1f, 2.2f, 10, 3.3f, 4.4f);
        b.reflectHorizontal();
        assertEquals(-3.3f,b.getXDelta(),"La delta X deberia ser -3.3");
    }

    @Test
    void reflectVertical() {
        Ball b = new Ball(1.1f, 2.2f, 10, 3.3f, 4.4f);
        b.reflectVertical();
        assertEquals(-4.4f,b.getYDelta(),"La delta Y deberia ser -4.4");
    }

    @Test
    void testToString() {
        Ball b = new Ball(1.1f, 2.2f, 10, 3.3f, 4.4f);
        assertEquals("Ball[(1.1,2.2), speed=(3.3,4.4)]",b.toString());
    }
}