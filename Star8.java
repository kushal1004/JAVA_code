package JAVA_code;
import java.util.Scanner;
public class Star8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the the number of rows u want to print: ");
        int row = sc.nextInt();
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }

        for(int i=1;i<=row-1;i++){
            for(int j=1;j<=row-i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        sc.close();
    }
    
}
