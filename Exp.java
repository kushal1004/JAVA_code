import java.util.Scanner;

public class Exp {
    public static void main(String[] str) {
        Scanner sc = new Scanner(System.in);
        // int[] arr = new int[4];
        int n = sc.nextInt();
        boolean isPrime = true;
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }

        sc.close();

    }
}
