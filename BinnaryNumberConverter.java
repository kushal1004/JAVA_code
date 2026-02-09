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
    }
}
