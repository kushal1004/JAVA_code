package JAVA_code;
import java.util.Scanner;
public class Alp3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of row: ");
        int r = sc.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=1;j<=i;j++){
                int c = 64+i;
                char ch = (char) c;
                System.out.print(" "+ch);
            }
            System.out.println();
        }
        sc.close();
    }
}
