public class p_5 {
    public static void main(String[] args) {
        Triangle t = new Triangle(3, 4, 5);
        System.out.println("Area of triangle: " + t.getArea());
        System.out.println("Perimeter of triangle: " + t.getPerimeter());
    }
}

class Triangle {
    int a, b, c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    double getArea() {
        int semiPeri = getPerimeter() / 2;
        double res = Math.sqrt(semiPeri * (semiPeri - a) * (semiPeri - b) * (semiPeri - c));
        return res;
    }

    int getPerimeter() {
        return a + b + c;
    }
}
