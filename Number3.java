import java.util.Scanner;

public class Number3 {
     public static void main(String[] args) {
        int num=1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Line: ");
        int r = sc.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" "+num+" ");
                num++;
            }
            System.out.println();
        }
        sc.close();
    }
    
}
