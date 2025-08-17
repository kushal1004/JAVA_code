package JAVA_code;
import java.util.Scanner;

public class Selection {
    public static void printArray(int[] ar) {
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // take input from user
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size]; // array declaration

        // taking input
        System.out.println("Enter the element of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        // before sort
        System.out.print("Before Sorting: ");
        printArray(arr);
        System.out.println();
        // selection sort (time complexity O(n^2))
        for (int i = 0; i < arr.length - 1; i++) {
            int small = i;
            for (int j = i + 1; j < arr.length; j++) {
                // checking element
                if (arr[small] > arr[j]) {
                    // swap
                    int temp = arr[small];
                    arr[small] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        // after sort
        System.out.print("After sorting: ");
        printArray(arr);
        sc.close();
    }
}
