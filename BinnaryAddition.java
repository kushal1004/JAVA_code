import java.util.Scanner;

public class BinnaryAddition {
    public static void performAddition(String str1, String str2) {
        int a = Integer.valueOf(str1, 2);
        int b = Integer.valueOf(str2, 2);
        int sum = a + b;
        String result = Integer.toBinaryString(sum);
        System.out.println("The sum of " + str1 + " and " + str2 + " is: " + result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first binary number:");
        String binary1 = sc.nextLine();
        System.out.println("Enter the second binary number:");
        String binary2 = sc.nextLine();

        performAddition(binary1, binary2);
        sc.close();
    }
}
