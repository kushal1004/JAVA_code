package JAVA_code;
public class Star6 {
    public static void main(String[] args) {
        int r = 5;
        for(int i=1;i<=r;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=((r*2)-(i*2-1));k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
