import java.util.Scanner;

public class p_9 {
    public static void main(String[] args) {
        int r1, r2, i1, i2;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter real and imaginary part for first number: ");
        r1 = input.nextInt();
        i1 = input.nextInt();
        System.out.println("Enter real and imaginary part for second number: ");
        r2 = input.nextInt();
        i2 = input.nextInt();
        Complex c1 = new Complex(r1, i1);
        Complex c2 = new Complex(r2, i2);
        System.out.print("Complex 1: ");
        c1.printComplex();
        System.out.print("Complex 2: ");
        c2.printComplex();
        c1.add(c2);
        System.out.print("After adding, Complex 1: ");
        c1.printComplex();
        c1.multiply(c2);
        System.out.print("After multiplying, Complex 1: ");
        c1.printComplex();
        input.close();
    }
}

class Complex {
    int real, img;

    Complex(int real, int img) {
        this.real = real;
        this.img = img;
    }

    Complex add(Complex c1) {
        this.real += c1.real;
        this.img += c1.img;
        return this;
    }

    Complex multiply(Complex c1) {
        int r = this.real;
        int i = this.img;
        this.real = r * c1.real - i * c1.img;
        this.img = r * c1.img + i*c1.real;
        return this;
    }

    void printComplex() {
        if (img >= 0)
            System.out.println(real + " + " + img + "i");
        else
            System.out.println(real + " - " + Math.abs(img) + "i");
    }
}