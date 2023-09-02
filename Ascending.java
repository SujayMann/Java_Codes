import java.util.Scanner;

public class Ascending {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a = n;
        System.out.println("Sequence: ");
        for(int i=0;i<=10;i++){
            System.out.println(i+n);
        }
        System.out.println("Sequence: ");
        for(int i=0;i<=10;i++){
            System.out.println(a);
            a+=3;
        }
        input.close();
    }
}