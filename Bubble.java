package JAVA_code;
import java.util.*;

public class Bubble {
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
        // Bubble sort (time complexity O(n^2))
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                // checking element
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        // after sort
        System.out.print("After sorting: ");
        printArray(arr);
        sc.close();
    }
}
