package Simple_Codes;
import java.util.*;
class factorial_fun{
    int fact;
     int p=1;
    void getdata(){
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the value of the factorial ");
        fact=obj.nextInt();
       
        for(int i=1;i<=fact;i++){
            p=p*i;
        }
        obj.close();
    }
    void printdata(){
        System.out.println("Factorial of "+fact+" is "+p);
    }
    public static void main(String argu[]){
        factorial_fun f=new factorial_fun();
        f.getdata();
        f.printdata();
        
    }
}