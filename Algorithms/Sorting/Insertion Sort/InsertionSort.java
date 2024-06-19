import java.util.Scanner;

public class InsertionSort {

    public static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int curr = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > curr) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = curr;
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

        insertionSort(arr);
        System.out.println("Sorted Array: ");
        printArray(arr);
        sc.close();
    }    
}
