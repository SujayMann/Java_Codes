import java.util.Scanner;

public class details {
    public static void main(String[] args) {
        String name, course = "";
        int age;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter you name: ");
        name = input.nextLine();
        System.out.println("Enter you age: ");
        age = input.nextInt();
        System.out.println("Enter you course: ");
        course += input.next();
        System.out.println("Name: " + name + "\nAge: " + age + "\nCourse: " + course);
        input.close();
    }
}
