package JAVA_code;
class students {

    static{
        System.out.println("I'm static of students class");
    }
    String name;
    int roll;
     int year = 4;
     String dept = "Information Technology";
    

    public students(int roll, String name) {
        this.name = name;
        this.roll = roll;
        print();
       
    }

    public students() {
        System.out.println("Students data is not stored yet");
    }

    public void print() {
        System.out.println("Name of the Student is " + this.name + " and his roll is " + this.roll);
    }

    public void print(int passwoard) {
        System.out.println("He is the student of " + this.year + "th year");
        System.out.println("His department name is: " + this.dept);
    }
}
class animal{
    static{
        System.out.println("I'm static of animal class");
    }
    public static void eat(){
        System.out.println("from eat method of animal");
    }
}

public class constructor {
    static{
        
        System.out.println("I'm from static block");
    }
    public static void eat(){
        System.out.println("from eat method of constructor");
    }
    public static void main(String[] args) {
        students man = new students(38, "kushal");
        man.print(123);
        students women = new students();
        women.print(456);

        // eat(); // as it is inside the same class no need to mention the class name
         animal.eat(); //using class name u can call this methos as it is static method
    }
}
