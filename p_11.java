import java.util.Scanner;

public class p_11 {
    public static void main(String[] args) {
        int f1, f2;
        double i1, i2;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter feet and inches for first distance: ");
        f1 = input.nextInt();
        i1 = input.nextDouble();
        System.out.println("Enter feet and inches for second distance: ");
        f2 = input.nextInt();
        i2 = input.nextDouble();
        AddDistance d1 = new AddDistance(f1, i1);
        AddDistance d2 = new AddDistance(f2, i2);
        AddDistance.add(d1, d2);
        input.close();
    }
}

class AddDistance {
    int feet;
    double inch;

    public AddDistance(int feet, double inch) {
        this.feet = feet;
        this.inch = inch;
    }

    static void add(AddDistance d1, AddDistance d2) {
        d1.feet += d2.feet;
        d1.inch += d2.inch;
        if (d1.inch >= 12) {
            d1.feet += (int) (d1.inch / 12);
            d1.inch %= 12;
        }
        if (d1.inch == 0.0)
            System.out.println("Resulting distance: " + d1.feet + "ft");
        else
            System.out.printf("Resulting distance: %dft %.2fin\n", d1.feet, d1.inch);
    }
}
