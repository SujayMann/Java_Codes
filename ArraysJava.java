import java.util.Scanner;

public class ArraysJava {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Enter size of array: ");
        n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements in array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        System.out.print("Array formed: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print("Array formed: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        input.close();
    }
}
