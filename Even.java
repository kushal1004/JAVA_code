package JAVA_code;
import java.util.*;
class isEven{
    public void evenOrOdd(int n){
        if(n<=0){
            System.out.println("Enter valid number");
        }
        else if(n%2==0){
            System.out.println("Even number");
        }
        else{
            System.out.println("Odd number");
        }
    }
}
public class Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        isEven r = new isEven();
        r.evenOrOdd(num);
        sc.close();
    }
    
}
