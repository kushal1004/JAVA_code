import java.util.Scanner;

public class classMonitor {
    public static void main(String[] args) {
        int prev = Integer.MAX_VALUE;
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("How many number of studnets are there");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int cur = sc.nextInt();
            if (prev > cur) {
                prev = cur;
                count++;
            }
        }
        System.out.println("Number of cut is: " + (count - 1));
        sc.close();
    }
}