import java.util.Scanner;

public class QuickSortNames {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of names: ");
        n = input.nextInt();
        String[] names = new String[n];
        System.out.println("Enter names: ");
        for(int i=0;i<n;i++)
            names[i]=input.next();
        quick_sort(names);
        for (String name : names)
            System.out.print(name + " ");
        input.close();
    }

    static void quick_sort(String[] arr) {
        if (arr == null || arr.length == 0)
            return;
        quickSort(arr, 0, arr.length - 1);
    }

    static void quickSort(String[] arr, int low, int high) {
        int i = low;
        int j = high;
        String pivot = arr[low+(high-low)/2];
        while (i <= j) {
            while (arr[i].compareToIgnoreCase(pivot) < 0)
                i++;
            while (arr[j].compareToIgnoreCase(pivot) > 0)
                j--;
            if (i <= j) {
                String temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        if (low<j)
            quickSort(arr, low, j);
        if (i < high)
            quickSort(arr, i, high);
    }
}