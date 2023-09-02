import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = input.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("* *");
        }
        System.out.println();
        for(int i=0;i<2;i++){
            for(int j=0;j<n;j++)
                System.out.print("* ");
            System.out.println();
        }
        System.out.println();
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++)
                System.out.print("* ");
            System.out.println();
        }
        System.out.println();
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++)
                System.out.print("  ");
            for(int j=0;j<=n-i-1;j++)
                System.out.print("* ");
            System.out.println();
        }
        System.out.println();
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++)
                System.out.print(" ");
            for(int j=0;j<=i;j++)
                System.out.print("* ");
            System.out.println();
        }
        input.close();
    }
}
