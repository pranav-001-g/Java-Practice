package Simple_Codes;
import java.util.*;
class nextLine{
    public static void main(String argu[]){
        String s;
       char a;
    Scanner obj=new Scanner(System.in);
    System.out.println("Enter the character");
    a=obj.next().charAt(0);
    System.out.println("Enter the String for ");
    obj.nextLine(); //this line is use ,when we need input of string including space in words and when we are thaking input of different 
    s=obj.nextLine();//data type then string (note if we input the char or int before string and we use space key insted of enter then no need of obj.nextLine()....)
    System.out.println(a);
    System.out.println(s);
    obj.close();  
    }
}