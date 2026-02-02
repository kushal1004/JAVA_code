import java.util.*;
import java.io.*;

public class Demo {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your age: ");
        int age = Integer.parseInt(br.readLine());
        System.out.println("My age is: "+age);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the input value: ");
        int input = sc.nextInt();
sc.nextLine();
        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        char[] nameArray = new char[name.length()];
        char[] nameChar = name.toCharArray();
       for(char i:nameChar){
            System.out.print(i);
       }
       System.out.println();
        System.out.println("Your input is: " + input);
        System.out.println("Your input is: " + name);


        int start = 0;
        int end = name.length() - 1;
        while(end >= 0)
        {
           nameArray[start] =  name.charAt(end);
           start++;
           end--;
        }

        for (char n : nameArray) {
            System.out.println(n);
        }

        sc.close();
    }
}
