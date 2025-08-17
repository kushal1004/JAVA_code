package JAVA_code;
import java.util.Scanner;

public class Intersection {
    public static void interSectionArray(int[] arr1, int[] arr2) {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] arr3 = new int[Math.min(arr1.length , arr2.length)];
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                arr3[k++] = arr1[i++];
                j++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }
        }
        System.out.println("Inter sect element/s is/are: ");
        for(int x = 0; x < k; x++){
        System.out.print(arr3[x] + " ");
    }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the 1st array: ");
        int size1 = sc.nextInt();
        System.out.println();
        System.out.print("Enter the size of the 2nd array: ");
        int size2 = sc.nextInt();
        int arr1[] = new int[size1];
        int arr2[] = new int[size2];
        System.out.println("Enter the element of the 1st array: ");
        for (int i = 0; i < size1; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter the element of the 2nd array: ");
        for (int j = 0; j < size2; j++) {
            arr2[j] = sc.nextInt();
        }
        interSectionArray(arr1, arr2);
        sc.close();
    }
}
