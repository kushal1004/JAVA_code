public class RomToInt {
    public static void main(String[] args) {
        // for each loop with CLI arguments
        System.out.println("Before type change: ");

        for (String str : args) {
            System.out.println(str + 1);
        }

        System.out.println("After type change: ");

        int sum = 0;

        for (String str : args) {
            sum += Integer.parseInt(str);

            System.out.println(Integer.parseInt(str) + 1);
        }

        System.out.println("The sum of the numbers is: " + sum);
    }
}
