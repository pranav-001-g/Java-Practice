package Simple_Codes;
import java.util.*;
public class ArrayListSwap {
    public static void swap(ArrayList<Integer>list,int si,int ei)
    {
        int temp=list.get(si);
        list.set(si, list.get(ei));
        list.set(ei,temp);

        System.out.println(list);
    }
  public static void main(String arg[]){
    ArrayList <Integer> list =new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    System.out.println(list);

    swap(list,1,3);



  }
}

