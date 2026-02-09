class Converter {
    public void binaryToDecimal(String str) {
        int intValue = Integer.valueOf(str, 2);
        System.out.println("Decimal value of " + str + " is: " + intValue);
    }

    void decimalToBinary(int val) {
        String str = Integer.toBinaryString(val);
        System.out.println("Binary value of " + val + " is: " + str);
    }
}

public class BinnaryNumberConverter {
    public static void main(String[] args) {
        Converter cnv = new Converter();
        cnv.binaryToDecimal("1010");
        cnv.decimalToBinary(10);

        int[][] num = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                num[i][j] = (int) (Math.random() * 10);
            }
        }

        for (int n[] : num) {
            for (int m : n) {
                System.out.print(m + " ");
            }
            System.out.println("");
        }
    }
}
