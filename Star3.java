import java.util.Scanner;
public class Star3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Line: ");
        int r = sc.nextInt();

//TUTORIAL RULES
// for(int i=1;i<=r;i++){
//             for(int j=1;j<=r;j++){
//                 if((i+j)<=r){
//                 System.out.print(" ");
//                 }else{
//                     System.out.print("*");
//                 }
//             }
//             System.out.println();
//         }

        //MY LOGIC

        for(int i=1;i<=r;i++){
            for(int j=1;j<=r-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                    System.out.print("*");
                }
            System.out.println();
        }
        sc.close();
    }
    
}
