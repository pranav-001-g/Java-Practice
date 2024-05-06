package Simple_Codes;
import java.util.*;
public class Reverse_Array {
  static void revers(int array[]){   //if your function is static no need to create the 
        int first =0;                //class object to call the function in same class as 
        int last =array.length-1;    //it is not public
        while (first<last) {
            int temp=array[last];
            array[last]=array[first];
            array[first]=temp;
            first++;
            last--;
        }
       
       System.out.println("\nRevers function invoke ");
    }
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int n=obj.nextInt();
        int array[]=new int[n];
        System.out.println("Enter the elements in the array ");
        for(int i=0;i<n;i++){
            array[i]=obj.nextInt();
        }


        // Reverse_Array r=new Reverse_Array();


        System.out.println("Array before reversing :");
        for(int i=0;i<n;i++){
            System.out.print(array[i]+" ");
        }
       revers(array); //object.revers(array) will only done when func is not static.

         System.out.println("Array after reversing :");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        obj.close();
    }
}