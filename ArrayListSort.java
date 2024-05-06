package Simple_Codes;
import java.util.*;

public class ArrayListSort {

    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(5);
        list.add(1);
        list.add(2);
        list.add(7);
        list.add(3);
        System.out.println(list);
        
        System.out.println("___________________ Array after sorting ___________________");

        Collections.sort(list);
        System.out.println(list);

        System.out.println("___________________ Array after revese sorting ___________________");
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
    }
}