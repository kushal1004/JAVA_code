import java.util.Scanner;

class swapNumber {

    public void withVariabel(int a, int b) {
        System.out.println("With 3rd Variable");
        System.out.println("Before Swaping ");
        System.out.println("Value of a: " + a);
        System.out.println("Value of b: " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After Swaping ");
        System.out.println("Value of a: " + a);
        System.out.println("Value of b: " + b);
    }

    public void withOutVariable(int a, int b) {
        System.out.println("With Out Variable");
        System.out.println("Before Swaping ");
        System.out.println("Value of a: " + a);
        System.out.println("Value of b: " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After Swaping ");
        System.out.println("Value of a: " + a);
        System.out.println("Value of b: " + b);

    }

    public void usingXor(int a, int b) {
        System.out.println("Using XOR");
        System.out.println("Before Swaping ");
        System.out.println("Value of a: " + a);
        System.out.println("Value of b: " + b);
        a = a ^ b ;
        b = a ^ b;
        a = a ^ b ;
        System.out.println("After Swaping ");
        System.out.println("Value of a: " + a);
        System.out.println("Value of b: " + b);
    }
}

public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();
        swapNumber swap = new swapNumber();
        swap.withOutVariable(a, b);
        swap.withVariabel(a, b);
        swap.usingXor(a, b);
        sc.close();
    }

}
