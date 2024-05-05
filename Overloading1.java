package OOP;
import java.util.*;
public class Overloading1 {
    int num1,num2,num3,g,gcd;
   
    void gdt (int num1,int num2){
        
         if(num1>num2){
        g=num1;
    }
    else{
        g=num2;
    }
        for(int i=1;i<=g;i++){
            if(num1%i==0 && num2%i==0){
                gcd=i;
            }
        }
        System.out.println("GCD of "+num1+" and "+num2+" is = "+gcd);
           System.out.println("===========================================================");
    }
    void gdt(int num3){
         System.out.println("===========================================================");
        System.out.println("Table of "+num3+" is =");
        for(int i=1;i<=10;i++){
            System.out.println(num3*i);

        }
           System.out.println("===========================================================");
    }
    public static void main(String srgu[]){
            Scanner obj= new Scanner(System.in);
            Overloading1 o=new Overloading1();
            System.out.println("enter the value of the num1 and num 2 for gcd and num3  for table");
            o.num1=obj.nextInt();
            o.num2=obj.nextInt();
            o.num3=obj.nextInt();
            o.gdt(o.num3);
            o.gdt(o.num1,o.num2);

            Dear d=new Dear(); //the object d of class Dear is from differnt file but we can access here because the are in same package
            d.eat(); 

            obj.close();  
            
    } 

}