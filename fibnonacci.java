package Simple_Codes;
import java.util.*;
class A{
     long a=0;
     long b=1;
     int n;
      A(){
    
        System.out.println("enter the value of fibnonacci number you want to display");
     }
}
     class C extends A {
            C(){
                 Scanner obj=new Scanner(System.in);
                  n=obj.nextInt();
                  System.out.print(a+" "+b);
                  obj.close();
            }
     }  
     class B extends C{
            B(){
            for(int i=0;i<n;i++){
            long c= a+b;
            a=b;
            b=c;
            System.out.print(" "+c);
            }
        }
     }

class fibnonacci{
    public static void main(String argu[]){
        new B();
        
    }
   
}