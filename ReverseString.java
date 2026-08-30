public class ReverseString {
    public static void main(String[] args) {
        String str = "Kushal";
        char[] arr = new char[str.length()];
        int j = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            arr[j++] = str.charAt(i);
        }
        for (char ar : arr) {
            System.out.println(ar);
        }
    }
}
