import java.util.*;

public class coronaVirus {
    public static void main(String[] args) {
        System.out.println();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Value of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Number of spikes: ");
        int sp = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print((arr[i] >> sp) + "");
        }
    }
}
