import  java.util.Scanner;

class Cal {

    public int reverse(int n) {
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + (n % 10);
            n /= 10;
        }
        return rev;
    }

    public void palindrome(int n) {
        if (n == reverse(n)) {
            System.out.println("The number " + n + " is Palindrome");
        } else {
            System.out.println("This number is not Palindrome number");
        }
    }

    public boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i*i <=n;i++){
            if(n%i==0) return false;
        }    return true;
            
    }

    public void repeatNumber(int[] arr){
        for(int i=0;i<arr.length;i++){

            boolean alreadyPrint = false;
            for(int j=0;j<i;j++){
                if(arr[i]==arr[j]){
                    alreadyPrint = true;
                    break;
                }
            }

            if(alreadyPrint){
                continue;
            }
            int count = 1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }

            if(count>1){
                System.out.println(arr[i]+" : "+count);
            }
        }
    }
}

public class Palindrome {

//using two pointers---------->

    public static boolean stringPalindrome(String str) {
        if (str == null || str.length() == 0) {
            return true;
        }
        for (int i = 0; i <= str.length() / 2; i++) {
            int start = str.charAt(i);
            int end = str.charAt(str.length() - 1 - i);
            if (start != end)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int arr[] = {2,3,4,5,7,2,3,7,2,3};
        Cal obj = new Cal();
        obj.repeatNumber(arr);
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter valid number: ");
        // int num = sc.nextInt();
        // Cal rev=new Cal();
        // System.out.println("Reverse of the "+num+" is: "+rev.reverse(num));
        // rev.palindrome(num);
        System.out.print("Enter the String: ");
        String str = sc.next();
        if (stringPalindrome(str)) {
            System.out.println("Pallindrome");
        } else {
            System.out.println("Not pallindrome");
        }
        sc.close();
    }

}
