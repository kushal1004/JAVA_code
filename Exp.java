import java.util.InputMismatchException;
import java.util.Scanner;
public class Exp {
    public static void main(String[] str){
        Scanner sc = new Scanner(System.in);
        try{
            int a = sc.nextInt();
            int b = sc.nextInt();
            int r = a/b;
            System.out.println(r);
        }// catch(Exception e) can not use this one bcz if i use here then rest of the catch block will be unreachable so it is better to use Exception at last
        catch(InputMismatchException e){
            System.out.println(e.getClass().getName()+":"+e.getMessage());
        }catch(ArithmeticException e){
            System.out.println(e.getClass().getName()+":"+e.getMessage());
        }
        catch(Exception e){
            System.out.println(e.getClass().getName());
            System.out.println(e.getMessage());
        }
        finally{
            sc.close();
            System.out.println("From finally block");
        }
    }
}
