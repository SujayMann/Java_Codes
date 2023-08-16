import java.util.Scanner;

public class percentage {
    public static void main(String[] args) {
        Double m1, m2, m3, m4, percentage;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter marks of first subject: ");
        m1 = input.nextDouble();
        System.out.println("Enter marks of second subject: ");
        m2 = input.nextDouble();
        System.out.println("Enter marks of third subject: ");
        m3 = input.nextDouble();
        System.out.println("Enter marks of fourth subject: ");
        m4 = input.nextDouble();
        percentage = (m1 + m2 + m3 + m4)/4.0;
        System.out.println("Your percentage is: " + percentage);
        input.close();
    }
}
