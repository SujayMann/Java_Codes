import java.util.Scanner;

public class p_8 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        Average avg = new Average(a, b, c);
        avg.calculate();
        input.close();
    }
}

class Average {
    int a, b, c;

    public Average(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    void calculate() {
        double avg = (a + b + c) / 3.0;
        System.out.printf("Average of %d %d %d is: %.2f", a, b, c, avg);
    }
}