package JAVA_code;
import java.util.*;
//Time compexity = O(m+n)

public class MedianOfArray {
    public static void printArray(int[] ar) {
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size of the First array: ");
        int size1 = sc.nextInt();
        System.out.print("Size of the second array: ");
        int size2 = sc.nextInt();

        int arr1[] = new int[size1];
        int arr2[] = new int[size2];
        int arr3[] = new int[size1 + size2];
        System.out.println("Enter the element of 1st array: ");
        for (int i = 0; i < size1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter the element of 2nd array: ");
        for (int i = 0; i < size2; i++) {
            arr2[i] = sc.nextInt();
        }

        System.out.println("Before merge: ");
        printArray(arr1);
        System.out.println();
        printArray(arr2);
        System.out.println();

        // merged array
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                arr3[k++] = arr1[i++];
            } else {
                arr3[k++] = arr2[j++];
            }
        }

        // copy rest of the element
        while (i < arr1.length) {
            arr3[k++] = arr1[i++];
        }

        while (j < arr2.length) {
            arr3[k++] = arr2[j++];
        }

        System.out.print("After merge: ");
        printArray(arr3);

        // Median of array
        int mid = arr3.length / 2;
        double median = 0;
        if (arr3.length % 2 == 0) {
            median = (arr3[mid] + arr3[(mid - 1)]) / 2.0;
        } else {
            median = arr3[mid];
        }
        System.out.println();
        System.out.print("Median of the array is: " + median);
        sc.close();
    }
}
