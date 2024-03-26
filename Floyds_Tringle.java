package Pattern;
import java.util.*;
public class Floyds_Tringle{
  
    public static void main(String argu[]){
        int num;
        System.out.println("enter the number draw patter ");
        Scanner obj=new Scanner(System.in);
        num=obj.nextInt();
        int count=1;
            System.out.println("=========THE PROGRAM STARTS==============");
        for (int i=1;i<num+1;i++){
             
            for(int j=1;j<=i;j++){
             
                System.out.print(count+" ");
                count++;
            }
            System.out.println("");
        
        }

        obj.close();  

    }
}