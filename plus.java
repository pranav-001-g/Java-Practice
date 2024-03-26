package Pattern;
import java.util.*;
public class plus{
    public static void main(String argu[]){
        Scanner obj=new Scanner(System.in);
        int num;
          System.out.println("enter odd value of paterns ");
        num=obj.nextInt();
        int cap=(num+1)/2;
        for(int i=1;i<=num;i++){
            
            for(int j =1;j<=num;j++){
               
                if(cap==j){
                System.out.print(" *");
                }
               else if(i==cap){
                  System.out.print(" *");
                }
                else{
                    System.out.print("  ");
                }
                
            }
            System.out.println("");
        } obj.close();  
    }
}