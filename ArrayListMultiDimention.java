package Simple_Codes;
import java.util.ArrayList;
public class ArrayListMultiDimention {
    public static void main(String arg[]){

        ArrayList <ArrayList<Integer>> mainlist=new ArrayList<>();

        ArrayList <Integer> list1=new ArrayList<>();
        ArrayList <Integer> list2=new ArrayList<>();
        ArrayList <Integer> list3=new ArrayList<>();

        for(int i=1;i<=5;i++){
            list1.add(i);
            list2.add(i*2);
            list3.add(i*3);
        }
        mainlist.add(list1);
        mainlist.add(list2);
        mainlist.add(list3);

        System.out.println(mainlist);

        for(int i=0;i<mainlist.size();i++){
            // ArrayList<Integer> curr=mainlist.get(i);  this is good to store the list in temp list and then access,
            
            for(int j=0;j<(mainlist.get(i)).size();j++){
                System.out.print((mainlist.get(i)).get(j)+" ");
            }
            System.out.println();
           
        }


    }
}
