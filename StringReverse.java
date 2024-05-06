package Simple_Codes;
import java.util.*;
public class StringReverse {
    
    public static void main(String argu[]){
     String name,eman="";
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the string to revers ");
       name=obj.next();
        System.out.println("you enter :- "+name);
        for (int i=name.length()-1;i>=0;i--){
             
            eman=eman+name.charAt(i);
        }
       System.out.println("revers string is = "+eman);
       obj.close();
    }
}