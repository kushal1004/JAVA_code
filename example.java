import multiplication.Multiply;
import multiplication.add.Add;

class Demo {
    Demo(int a) {
        System.out.println("This is the parametarized constructor");
    }

    Demo() {
        System.out.println("This is default constructor");
    }
}

public class example {
    public static void main(String[] args) {
        Multiply obj = new Multiply();
        Add obj1 = new Add();
        Demo obj2 = new Demo();
        Demo obj3 = new Demo(5);

        obj1.add(5, 6);
        obj.Multiplication(5, 6);
    }
}
