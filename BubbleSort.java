import java.util.Scanner;

public class BubbleSort {
    public static void bubble_sort(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) { // > for ascending
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if(!swapped)
                return;
        }
    }

    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements in array: ");
        for (int i = 0; i < n; i++)
            arr[i] = input.nextInt();
        bubble_sort(arr, n);
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        input.close();
    }
}