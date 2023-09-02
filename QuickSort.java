import java.util.Scanner;

public class QuickSort {
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low, j = high;
        while (i < j) {
            while (i <= high - 1 && arr[i] <= pivot)
                i++;
            while (j >= low + 1 && arr[j] > pivot)
                j--;
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[j];
        arr[j] = arr[low];
        arr[low] = temp;
        return j;
    }

    public static void quick_sort(int[] arr, int low, int high) {
        if (low < high) {
            int pivot = partition(arr, low, high);
            quick_sort(arr, low, pivot - 1);
            quick_sort(arr, pivot + 1, high);
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
        System.out.println("Array formed: ");
        for (int i : arr)
            System.out.print(i + " ");
        quick_sort(arr, 0, n - 1);
        System.out.println("\nSorted array: ");
        for (int i : arr)
            System.out.print(i + " ");
        input.close();
    }
}