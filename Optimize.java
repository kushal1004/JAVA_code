import java.util.Arrays;
import java.util.Scanner;

public class Optimize{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the element of the array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int count = 0;
       int optimize = -10;
        for(int i=0;i<n;i++){
            //int optimize = arr[i];
            if(arr[i] == optimize){
                count++;
            }else{
                if(count == 0){
                    optimize = arr[i];
                    count++;
                }else{
                    count--;
                    if(count == 0){
                        optimize = arr[i];
                    }
                }
            }
        }
        System.out.println(optimize);
        sc.close();
    }
}