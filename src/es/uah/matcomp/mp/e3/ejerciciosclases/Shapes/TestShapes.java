package es.uah.matcomp.mp.e3.ejerciciosclases.Shapes;

public class TestShapes {
    public static void main(String[] args){
        //Test Shape
        Shape sh1 = new Shape(); //Constructors
        Shape sh2 = new Shape("blue",true);
        System.out.println(sh1); //toString
        sh2.setColor("green"); //Setters
        sh2.setFilled(false);
        System.out.println(sh2.getColor()); //Getters
        System.out.println(sh2.isFilled());
        //Test Circle
        Circle c1 = new Circle(); //Constructors
        Circle c2 = new Circle(33);
        Circle c3 = new Circle("purple",false,1);
        System.out.println(c2); //toString
        c2.setRadius(64); //Setter
        System.out.println(c2.getRadius()); //Getters
        System.out.println(c1.getArea());
        System.out.println(c3.getPerimeter());
        //Test Rectangle
        Rectangle r1 = new Rectangle(); //Constructors
        Rectangle r2 = new Rectangle(2,3);
        Rectangle r3 = new Rectangle("pink",true,11,13);
        System.out.println(r3); //toString
        r2.setLength(5); //Setters
        r2.setWidth(4);
        System.out.println(r1.getWidth()); //Getters
        System.out.println(r1.getLength());
        System.out.println(r2.getArea());
        System.out.println(r2.getPerimeter());
        //Test Square
        Square sq1 = new Square(); //Constructors
        Square sq2 = new Square(4);
        Square sq3 = new Square("vantablack",true,6);
        System.out.println(sq3); //toString
        sq1.setSide(7);
        sq2.setWidth(9);
        sq3.setLength(5);
        System.out.println(sq1.getSide());
    }
}