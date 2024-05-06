package Simple_Codes;
import java.util.*;

public class ArrayList1{
    public static void main(String[] args) {
        //ArrayList cannot access primitive datatypes directly.
        ArrayList <Integer> list = new ArrayList<>(); 
        // ArrayList<String> Slist=new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3); //O(1);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(list);

        System.out.println( list.get(1));   //O(1);
        
        list.add(1,90);  //O(N);
        System.out.println(list);
        
        list.remove(5);          //O(N);
        System.out.println("After removing index 5 : "+list);

        list.set(1,99);    //O(N);
        System.out.println(list);

        System.out.println(list.contains(99));    //O(N)
        
        System.out.println(list.contains(90));     //O(N)

        System.out.println(list.isEmpty());
        
       

        

    }
}
