import java.util.Scanner;

public class SelectionSort {
    public static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp; 
    }

    public static void selectionSort(int[] arr) {
        int i, j, min_index;
        int n = arr.length;

        for (i = 0; i < n - 1; i++) {
            min_index = i;

            for (j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }
            }

            swap(arr, min_index, i);
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int arr_size = 0;
        if (sc.hasNextInt()) {
            arr_size = sc.nextInt();
        }

        int[] arr = new int[arr_size];

        System.out.println("Enter the elements of the array: ");

        for (int i = 0; i < arr_size; i++) {
            if (sc.hasNextInt()) {
                arr[i] = sc.nextInt();
            }
        }

        selectionSort(arr);
        System.out.println("Sorted array: ");
        printArray(arr);
        sc.close();
    }
}