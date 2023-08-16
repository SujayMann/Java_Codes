import java.util.Scanner;

public class Divisibility {
    static boolean divBy2(int n) {
        n = Math.abs(n);
        int m = n % 10;
        if (m == 0 || m == 2 || m == 4 || m == 6 || m == 8)
            return true;
        return false;
    }

    static boolean divBy3(int n) {
        n = Math.abs(n);
        int res = 0;
        while (n > 0) {
            res += n % 10;
            n /= 10;
        }
        if (res % 3 == 0)
            return true;
        return false;
    }

    static boolean divBy4(int n) {
        n = Math.abs(n);
        int res = 0, i = 0, revRes = 0;
        String s = Integer.toString(n);
        if (s.length() >= 2) {
            while (i < 2) {
                res = res * 10 + n % 10;
                n /= 10;
                i++;
            }
        } else {
            while (n > 0) {
                res = res * 10 + n % 10;
                n /= 10;
            }
        }
        while (res > 0) {
            revRes = revRes * 10 + res % 10;
            res /= 10;
        }
        if (revRes % 4 == 0)
            return true;
        return false;
    }

    static boolean divBy5(int n) {
        n = Math.abs(n);
        String s = Integer.toString(n);
        if (s.endsWith("0") || s.endsWith("5"))
            return true;
        return false;
    }

    static boolean divBy6(int n) {
        if (divBy2(n) && divBy3(n))
            return true;
        return false;
    }

    static boolean divBy7(int n) {
        if (n == 0)
            return true;
        n = Math.abs(n);
        while (n > 0) {
            int m = n % 10;
            n /= 10;
            n = Math.abs(n - (2 * m));
            if (n == 7 || n == 0)
                return true;
            if (n < 10)
                return false;
        }
        return false;
    }

    static boolean divBy8(int n) {
        n = Math.abs(n);
        int res = 0, i = 0, revRes = 0;
        String s = Integer.toString(n);
        if (s.length() >= 3) {
            while (i < 3) {
                res = res * 10 + n % 10;
                n /= 10;
                i++;
            }
        } else {
            while (n > 0) {
                res = res * 10 + n % 10;
                n /= 10;
            }
        }
        while (res > 0) {
            revRes = revRes * 10 + res % 10;
            res /= 10;
        }
        if (revRes % 8 == 0)
            return true;
        return false;
    }

    static boolean divBy9(int n) {
        n = Math.abs(n);
        int res = 0;
        while (n > 0) {
            res += n % 10;
            n /= 10;
        }
        if (res % 9 == 0)
            return true;
        return false;
    }

    static boolean divBy10(int n) {
        n = Math.abs(n);
        String s = Integer.toString(n);
        if (s.endsWith("0"))
            return true;
        return false;
    }

    static boolean divBy11(int n) {
        n = Math.abs(n);
        String s = Integer.toString(n);
        int res = 0, odds = 0, evens = 0, x = n;
        while (x > 0) {
            res += x % 10;
            x /= 10;
        }
        for (int i = 0; i < s.length(); i += 2)
            odds += Integer.valueOf(s.charAt(i)) - '0';
        evens = Math.abs(res - odds);
        if ((Math.abs(evens - odds)) % 11 == 0)
            return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner input = new Scanner(System.in);
        int n = 0;
        try {
            n = input.nextInt();
            if (divBy2(n))
                System.out.println("Divisible by 2");
            else
                System.out.println("Not divisible by 2");
            if (divBy3(n))
                System.out.println("Divisible by 3");
            else
                System.out.println("Not divisible by 3");
            if (divBy4(n))
                System.out.println("Divisible by 4");
            else
                System.out.println("Not divisible by 4");
            if (divBy5(n))
                System.out.println("Divisible by 5");
            else
                System.out.println("Not divisible by 5");
            if (divBy6(n))
                System.out.println("Divisible by 6");
            else
                System.out.println("Not divisible by 6");
            if (divBy7(n))
                System.out.println("Divisible by 7");
            else
                System.out.println("Not divisible by 7");
            if (divBy8(n))
                System.out.println("Divisible by 8");
            else
                System.out.println("Not divisible by 8");
            if (divBy9(n))
                System.out.println("Divisible by 9");
            else
                System.out.println("Not divisible by 9");
            if (divBy10(n))
                System.out.println("Divisible by 10");
            else
                System.out.println("Not divisible by 10");
            if (divBy11(n))
                System.out.println("Divisible by 11");
            else
                System.out.println("Not divisible by 11");
        } catch (Exception e) {
            System.out.println("Enter a valid number");
        }
        input.close();
    }
}
