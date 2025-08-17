package JAVA_code;
import java.util.*;
class students{
    int roll;
    String name;
    
     public students(int roll, String name){
        this.name = name;
        this.roll = roll;
    }
    

    @Override
    public String toString() {
        return "roll=" + roll + ", name=" + name + "";
    }
    
}
public class Gen {
    public static void main(String str[]){
      /* 
      ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> newList = new ArrayList<>();
         newList.add(15);
         newList.add(16);
         newList.add(17);
         newList.add(18);
        list.add(5);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        list.add(4);
        System.out.println(list);
        System.out.println("The List contains 5? : "+list.contains(5));
        System.out.println("Is the list empty?: "+list.isEmpty());
        System.out.println("Size of the list is: "+list.size());
        System.out.println("Remove the element 10: "+list.remove(4));
        System.out.println(list);

        list.addAll(1,newList);
        //System.out.println(list);
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        } 
            */ 
       ArrayList<Integer> list = new ArrayList<>();
       list.add(15);
       list.add(16);
       list.add(19);
       list.add(15);
       list.add(11);
       list.add(12);
       System.out.println(list);

       
    }
}

