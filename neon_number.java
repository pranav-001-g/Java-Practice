package Simple_Codes;
import java.util.*;
public class neon_number {
    int sum=0;
   
    neon_number(int num,int m){
        while(num>0){
            int p=num%10;
            sum=sum+p;
            num=num/10;
            
        }
         System.out.println("===============================================================");

        if(sum==m){
            System.out.println("It is an neon number ");
             System.out.println("===============================================================");

        }
          
      else{
            System.out.println("It is not neon number ");
            System.out.println("===============================================================");
        }
           
    }
   
    public static void main(String argu[]){
         int num;
         Scanner obj=new Scanner(System.in);
            System.out.println("===============================================================");
         System.out.println("enter the number to check is it ");
            System.out.println("===============================================================");
         num=obj.nextInt();
         int sq=num*num;
         new neon_number(sq,num); //actuly we create the obj to run the consturctor of neon_number 
         obj.close();            //for example:-
         
    }
}