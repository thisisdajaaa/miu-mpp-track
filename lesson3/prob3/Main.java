package lesson3.prob3;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle();
        Circle circle2 = new Circle(2.0);

        Cylinder newCylinder1 = new Cylinder(2.0);
        Cylinder newCylinder2 = new Cylinder(2.0,3.0);

        System.out.println("Area of Circle1(default constructor):"  + circle.getArea() + " Radius:" + circle.getRadius());
        System.out.println();
        System.out.println("Area of Circle2(radius as parameter):"  + circle2.getArea() + " Radius:" + circle2.getRadius());
        System.out.println();
        System.out.println("Composition Volume of Cylinder1:"  + newCylinder1.getVolume() + " Height:" + newCylinder1.getHeight());
        System.out.println();
        System.out.println("Composition Volume of Cylinder2:"  + newCylinder2.getVolume() + " Height:" + newCylinder2.getHeight());
    }
}
