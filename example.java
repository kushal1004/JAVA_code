import multiplication.Multiply;
import multiplication.add.Add;

class Demoo {
    Demoo(int a) {
        System.out.println("This is the parametarized constructor");
    }

    Demoo() {
        System.out.println("This is default constructor");
    }

    private static int x;

    void f1() {
        x = 22;
    }

    void f2() {
        System.out.println(x);
    }

    void f3() {
        x = 45;
    }
}

class Parent {
    Parent() {
        System.out.println("Parent constructor");
    }
}

class Child extends Parent {
    Child() {
        // super(); // called implicitly if not written
        System.out.println("Child constructor");
    }
}

public class example {
    public static void main(String[] args) {
        Multiply obj = new Multiply();
        Add obj1 = new Add();
        Demoo obj2 = new Demoo();
        Demoo obj3 = new Demoo(5);
        Parent obj5 = new Child();

        String str = "Kushal Singha";
        System.out.println("Length of the str is: " + str.length());

        for (int i = 0; i < str.length(); i++) {
            System.out.println("Value of indexed " + i + " is " + str.charAt(i));
        }

        StringBuffer sb = new StringBuffer(str);
        StringBuffer sb1 = new StringBuffer();

        System.out.println("Capacity: " + sb.capacity());
        System.out.println("Length: " + sb.length());

        System.out.println("Capacity1: " + sb1.capacity());
        System.out.println("Length1: " + sb1.length());

        sb.append(" is a good boy");

        System.out.println("length: " + sb.length());
        System.out.println(sb);

        obj1.add(5, 6);
        obj.Multiplication(5, 6);

        obj2.f1();
        obj3.f3();
        obj2.f2();
    }
}
