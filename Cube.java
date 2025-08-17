package JAVA_code;
import java.util.Scanner;
public class Cube{

    public int oppositeFaceOfDice(int n){
        int ans=0;
        if(n==1){
            ans = 6;
        }else if(n==2){
            ans = 5;
        }else if(n==3){
            ans=4;
        }else if(n==4){
            ans = 3;
        }else if(n==5){
            ans=2;
        }else if(n==6){
            ans=1;
        }
        else{
            System.out.println("Please enter a valid number which is present in ordinary Dice");
        }
        return ans;
    }

    public int opositeFace(int n){
        int oposite = 7-n;
        return oposite;
    }
}

class Dice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the valide Face side number: ");
        int face = sc.nextInt();
        Cube obj = new Cube();
        if(face >=1 && face <=6){
        System.out.println("If face is: "+face+" then oposite side will be: "+obj.oppositeFaceOfDice(face));
        System.out.println("If face is: "+face+" then oposite side will be: "+obj.opositeFace(face));
        }else{
           System.out.println("Please enter a valid number which is present in ordinary Dice"); 
        }
        sc.close();
    }    
}
