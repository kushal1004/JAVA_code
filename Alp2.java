package JAVA_code;
import java.util.Scanner;
public class Alp2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows u want to print: ");
        int r = sc.nextInt();
        //int j=1;
        // int c = 64+j;
        // char ch = (char)c;
        for(int i=1;i<=r;i++){
            for(int j=1;j<=i;j++){
                int c = 64+j;
                char ch = (char)c;
                System.out.print(" "+ch);
            }
            System.out.println();
        }
        sc.close();
    }
    
}
