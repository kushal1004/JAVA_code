package JAVA_code;
import java.util.Scanner;
public class Star1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of line: ");
        int r=sc.nextInt();
        for(int i=0;i<r;i++){
            for(int j=0;j<r;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        sc.close();
    }
}
