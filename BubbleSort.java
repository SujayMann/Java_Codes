import java.util.Scanner;

public class BubbleSort {
    public static int bubble_sort(int[] arr, int n) {
        int swaps = 0;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) { // > for ascending
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                    swaps++;
                }
            }
            if(!swapped)
                return swaps;
        }
        return swaps;
    }

    public static void main(String[] args) {
        int n, swaps = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements in array: ");
        for (int i = 0; i < n; i++)
            arr[i] = input.nextInt();
        swaps = bubble_sort(arr, n);
        System.out.println("Sorted array: ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println("\nNumber of swaps: " + swaps);
        input.close();
    }
}