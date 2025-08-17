package JAVA_code;
import java.util.Scanner;
class Another{

    public void star(int n){
        System.out.println("Using another method:->");
        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
public class Star2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of line: ");
        int r=sc.nextInt();

//USING NORMAL PROCESS

        // for(int i=0;i<r;i++){
        //     for(int j=0;j<r-i;j++){
        //         System.out.print(" * ");
        //     }
        //     System.out.println();
        // }
        Another obj = new Another();
        obj.star(r);
        sc.close();
    }
    
}
