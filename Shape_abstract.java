// import java.util.Scanner;

abstract class Shape {
    int length = 5, breadth = 7;
    abstract public void printArea();
}

class Rectangle extends Shape {
    // public Rectangle(int l, int b) {
    //     length = l;
    //     breadth = b;
    // }
    public void printArea() {
        System.out.println("Area of Rectangle: " + length * breadth);
    }
}

class Triangle extends Shape {
    // public Triangle(int b, int h) {
    //     length = b;
    //     breadth = h;
    // }
    public void printArea() {
        System.out.println("Area of triangle: " + 0.5 * length * breadth);
    }
}

class Circle extends Shape {
    // public Circle(int r) {
    //     length = r;
    // }
    public void printArea() {
        System.out.println("Area of circle: " + 3.14 * length * length);
    }
}

public class Shape_abstract {
    public static void main(String[] args) {
        // int l, b;
        // Scanner input = new Scanner(System.in);
        // System.out.println("Enter length and breadth of rectangle: ");
        // l = input.nextInt();
        // b = input.nextInt();
        // Rectangle r = new Rectangle(l, b);
        Rectangle r = new Rectangle();
        r.printArea();
        // System.out.println("Enter base and height of triangle: ");
        // l = input.nextInt();
        // b = input.nextInt();
        // Triangle t = new Triangle(l, b);
        Triangle t = new Triangle();
        t.printArea();
        // System.out.println("Enter radius of circle: ");
        // l = input.nextInt();
        // Circle c = new Circle(l);
        Circle c = new Circle();
        c.printArea();
    }
}
