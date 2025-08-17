package JAVA_code;
import java.util.Scanner;
import java.util.Arrays;

public class practice {
        public static int gcd(int a, int b) {
                while (b != 0) {
                        int temp = b;
                        b = a % b;
                        a = temp;
                }
                return a;
        }

        public static void reverse(int[] ar, int start, int end) {
                while (start < end) {
                        int temp = ar[start];
                        ar[start] = ar[end];
                        ar[end] = temp;
                        start++;
                        end--;
                }
        }

        public static void rotate(int[] arr, int k) {
                int n = arr.length;
                k %= n;
                reverse(arr, 0, n - 1);
                reverse(arr, 0, k - 1);
                reverse(arr, k, n - 1);

        }

        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the number of rows: ");
                int row = sc.nextInt();
                int[] arr = new int[row];

                for (int i = 0; i < arr.length; i++) {
                        arr[i] = sc.nextInt();
                }

                System.out.println("Your Array is: ");
                for (int i = 0; i < arr.length; i++) {
                        System.out.print(arr[i] + " ");
                }
                System.out.println();

                // insertion at beginning ------------->
                /*
                 * System.out.println("Enter the new value: ");
                 * int newVal = sc.nextInt();
                 * int newArr[] = new int[row+1];
                 * newArr[0] = newVal;
                 * for(int i=0;i<arr.length;i++){
                 * newArr[i+1] = arr[i];
                 * }
                 * // print new array
                 * 
                 * for (int num : newArr) {
                 * System.out.print(num + " ");
                 * }
                 * System.out.println();
                 */

                // insert at any position ------------->
                /*
                 * System.out.println("Enter your new Position: ");
                 * int position = sc.nextInt();
                 * System.out.println("Enter new Value: ");
                 * int value = sc.nextInt();
                 * int newArr[] = new int[row+1];
                 * for(int i=0;i<position;i++){
                 * newArr[i]=arr[i];
                 * }
                 * newArr[position] = value;
                 * for(int i=position;i<arr.length;i++){
                 * newArr[i+1] = arr[i];
                 * }
                 */
                // insert at end ------------->
                /*
                 * int newArr[] = new int[row+1];
                 * System.out.println("Enter your value: ");
                 * int value = sc.nextInt();
                 * for(int i=0;i<arr.length;i++){
                 * newArr[i]=arr[i];
                 * }
                 * newArr[arr.length] = value;
                 */

                // delete by position --------->
                /*
                 * int newArr[] = new int[arr.length-1];
                 * System.out.println("Enter your position to delete: ");
                 * int positionOfDelete = sc.nextInt();
                 * for(int i=0 ,j=0;i<arr.length;i++){
                 * if( i == positionOfDelete) continue;
                 * newArr[j++] = arr[i];
                 * }
                 */

                // delete by value ------------->
                /*
                 * int newArr[] = new int[row-1];
                 * System.out.println("Enter your value: ");
                 * int value = sc.nextInt();
                 * boolean found = false;
                 * for(int i=0,j=0;i<arr.length;i++){
                 * if( !found && arr[i] == value) {
                 * found = true;
                 * continue;
                 * }
                 * newArr[j++]=arr[i];
                 * }
                 */

                // array reverse -------------->
                /*
                 * int left = 0;
                 * int right = arr.length-1;
                 * while(left < right){
                 * int temp = arr[left];
                 * arr[left] = arr[right];
                 * arr[right] = temp;
                 * left++;
                 * right--;
                 * }
                 */

                // print same array oparation -------->
                /*
                 * for (int i = 0; i < arr.length; i++) {
                 * System.out.print(arr[i]+" ");
                 * }
                 */

                // print new array -------->
                /*
                 * for (int num : newArr) {
                 * System.out.print(num + " ");
                 * }
                 */
                // Linear Search --------------->
                /*
                 * System.out.println("Enter your target element: ");
                 * int target = sc.nextInt();
                 * int found=0;
                 * for(int i=0;i<arr.length;i++){
                 * if(arr[i] == target){
                 * System.out.println("Element found at "+i+" index");
                 * found=1;
                 * }
                 * }
                 * if(found == 0){
                 * System.out.println("Your Target Element not present in the array ");
                 * }
                 */
                // Binarry Search --------------->
                /*
                 * System.out.println("Enter your Target element: ");
                 * int target = sc.nextInt();
                 * int left = 0;
                 * int right = arr.length - 1;
                 * while(left <= right){
                 * int mid = (left+right) /2;
                 * if(arr[mid] == target){
                 * System.out.println("Element found at index:  "+mid);
                 * break;
                 * }else if( target < arr[mid]){
                 * right = mid - 1;
                 * }else{
                 * left = mid + 1 ;
                 * }
                 * }
                 */
                // Hash Table ---------------------->
                /*
                 * HashMap<Integer, Integer> map = new HashMap<>();
                 * for (int i = 0; i < arr.length; i++) {
                 * map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
                 * }
                 * for (int i = 0; i < arr.length; i++) {
                 * if (map.get(arr[i]) > 1) {
                 * System.out.println("First repeating element: " + arr[i]);
                 * System.out.println( map.get(arr[i])+" times in the array");
                 * break;
                 * }
                 * }
                 */
                // 2nd largest element in an array--------------->
                /*
                 * int first = 0;
                 * int second = 0;
                 * if(arr.length < 2){
                 * System.out.println(-1);
                 * }
                 * else{
                 * for(int i=0;i<arr.length;i++){
                 * if(arr[i] > first){
                 * second = first;
                 * first = arr[i];
                 * }else if(arr[i] > second && arr[i] != first){
                 * second = arr[i];
                 * }
                 * }
                 * if(second == 0){
                 * System.out.println(-1);
                 * }else{
                 * System.out.println("Second largest element is:  "+second);
                 * }
                 * }
                 */

                // move all zero at the last ----------------->
                /*
                 * int index = 0;
                 * for(int i = 0;i<arr.length;i++){
                 * if(arr[i] != 0){
                 * arr[index]=arr[i];
                 * index++;
                 * }
                 * }
                 * while(index<arr.length){
                 * arr[index++]=0;
                 * }
                 * for (int i = 0; i < arr.length; i++) {
                 * System.out.print(arr[i]+" ");
                 * }
                 */

                // rotate array anti clock wise (shifting or jugling algorithm)------------------>
                /*
                 * System.out.println("Enter the value of shifting: ");
                 * int d = sc.nextInt();
                 * d %=row; //if d>row
                 * int cycle = gcd(row,d);
                 * for(int i=0;i<cycle;i++){
                 * int startElement = arr[i];
                 * int currentIndex = i;
                 * while(true){
                 * int nextIndex = (currentIndex+d) % row; // if d>row then % part is requried
                 * if(nextIndex == i) break;
                 * arr[currentIndex] = arr[nextIndex];
                 * currentIndex = nextIndex;
                 * }
                 * arr[currentIndex] = startElement;
                 * }
                 * for (int i = 0; i < arr.length; i++) {
                 * System.out.print(arr[i]+" ");
                 * }
                 */
                
                 // rotate array from last to first

                System.out.println("Enter your value: ");
                int k = sc.nextInt();
                rotate(arr, k);
                System.out.println(Arrays.toString(arr));
                sc.close();
        }
}