package JAVA_code;
import java.util.Scanner;
public class Alp1 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
       System.out.print("Enter your input: ");
       int r = sc.nextInt();
       for(int i=0;i<r;i++){
        for(int j=1;j<=r-i;j++){
            int c=64+j;
            char ch = (char) c;
            System.out.print(" "+ch);
        }
        System.out.println();
       }
       sc.close();
    }
    
}
