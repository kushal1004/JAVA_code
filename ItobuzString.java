package JAVA_code;

import java.util.Scanner;

class check {
    public String palindrome(String str) {
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int end = str.length() - 1;
        int start = 0;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return "false";
            }
            start++;
            end--;
        }
        return "true";
    }
}

public class ItobuzString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String input: ");
        String str = sc.nextLine();
        check obj = new check();
        System.out.println(obj.palindrome(str));
        sc.close();
    }
}
