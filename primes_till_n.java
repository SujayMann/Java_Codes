import java.util.Scanner;

public class primes_till_n {
    public static void primesTillN(int n) {
        if (n <= 1) {
            System.out.println("None");
            return;
        }
        for (int i = 2; i <= n; i++) {
            int count = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0)
                    count++;
            }
            if (count == 0)
                System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int n;
        System.out.println("Enter a number: ");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        input.close();
        System.out.print("Prime numbers till " + n + ": ");
        primesTillN(n);
    }
}
