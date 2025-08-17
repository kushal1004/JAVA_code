package JAVA_code;
import java.util.*;
public class Main{
    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for (int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
            return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
          System.out.println("Enter hte value a: ");
          int a = sc.nextInt();
          if(isPrime(a)){
          System.out.println("True->Prime");
          }else{
            System.out.println("False->Not Prime");
          }
          sc.close();
    }
}