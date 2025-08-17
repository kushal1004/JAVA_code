package JAVA_code;
import java.util.Scanner;
public class GFG {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Row: ");
        int r = sc.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=1;j<=r;j++){
                int c  = 64+j; // print the character
                char ch = (char) c;
                if((i+j)<=r){
                    System.out.print(" ");
                }else{
                    System.out.print(" "+ch);
                }
                // System.out.print(" # ");
            }
            System.out.println();
        }
        sc.close();
    }
    
}
