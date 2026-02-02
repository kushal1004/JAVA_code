import java.util.Scanner;
class Calc{

    public int iterative(int n){
        int sum=0;
        while(n!=0){
            sum+=(n%10); // take last number to add
            n=n/10; // To remove last number (already taken)
        }
        return sum;
    }

    public int SumOfDigit(int n){
        if(n==0){
            return 0;
        }
        return (n%10) + SumOfDigit(n/10);
    }

    public int stringDigit(String n){
        int digit = 0;

        //Advanced For loop

        // for(char i:n.toCharArray()){ // advanced fro loop[only for an array]
        //     digit+=i-'0';
        //    // System.out.print(i);
        // }

        for(int i=0;i<n.length();i++){
         digit += n.charAt(i)-'0';
        }
        return digit;
    }

}


public class Sum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your Number: ");
        int digit = sc.nextInt();
        System.out.println("Enter your Number type String: ");
        String num = sc.next();
        Calc sum = new Calc();
        System.out.println("Sum of the Digit is(iterative) "+sum.iterative(digit));
        System.out.println("Sum of the Digit is(recursive): "+sum.SumOfDigit(digit));
        System.out.println("Sum of the Digit is(String number): "+sum.stringDigit(num));
        sc.close();


    }
    
}
