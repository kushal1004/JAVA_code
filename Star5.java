package JAVA_code;
import java.util.Scanner;

public class Star5 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of row U want to print: ");
        int row = sc.nextInt();
        for(int i=1;i<=row;i++){
            for(int space=1;space<=row-i;space++){
                System.out.print(" ");
            }
            for(int k=1;k<=i*2-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
    
}
