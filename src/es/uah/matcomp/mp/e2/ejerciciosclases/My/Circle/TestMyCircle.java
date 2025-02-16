package es.uah.matcomp.mp.e2.ejerciciosclases.My.Circle;

import es.uah.matcomp.mp.e2.ejerciciosclases.My.Point.MyPoint;

public class TestMyCircle {
    public static void main(String[] args){
        MyCircle c0 = new MyCircle(); //Test constructor by default
        MyCircle c1 = new MyCircle(1,1,5); //Test constructor by coordinates and radius
        MyPoint c = new MyPoint(2,2);
        MyCircle c2 = new MyCircle(c,10); //Test constructor by center and radius
        System.out.println(c0); //Test toString
        c0.setCenterX(1); //Test setters
    }
}
