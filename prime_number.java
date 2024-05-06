package Simple_Codes;
import java.util.*;
public class prime_number{
    public static void main(String argu[]){
        int num,i;
        float a;
        Scanner obj=new Scanner(System.in);
        
        System.out.print("enter the number you want't to check ");
        num=obj.nextInt();
        for (i=2;i<num;i++){
            a=num%i;
            if(a==0){
                System.out.print("The number is not prime ");
                obj.close();
                System.exit(0);
            }
            
        }
          
                System.out.print("The number is  prime ");
               
            
        
        obj.close();  
    }
}