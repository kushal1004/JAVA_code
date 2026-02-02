package JAVA_code;
import java.util.Scanner;

class Cal {

    public int reverse(int n) {
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + (n % 10);
            // take first last number and multiply with 10
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
