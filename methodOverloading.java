class methodOverloadingg {
public int add(int a, int b){
    return a+b;
}
public int add(int a, int b, int c){
    return a+b+c;
}
}
public class methodOverloading {
    public static void main(String[] args) {
        methodOverloadingg obj = new methodOverloadingg();
        System.out.println("Sum of two integers: " + obj.add(5, 10));
        System.out.println("Sum of three integers: " + obj.add(5, 10, 15));
        System.out.println("Sum of two doubles: " + obj.add(5, 10));
    }
}
