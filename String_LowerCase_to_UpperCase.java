package Simple_Codes;
import java.util.*;
public class String_LowerCase_to_UpperCase {
   public static String UpperCase(String s){
    StringBuffer sb=new StringBuffer();
    sb.append(Character.toUpperCase(s.charAt(0)));
        for(int i=1;i<s.length();i++){
            char ch=s.charAt(i);
            sb.append(ch);
            if(ch==' ' && i<s.length()-1){
                ch=s.charAt(i+1);
                sb.append(Character.toUpperCase(ch));
                i++;
            }
            
        }
        return "Answer is ****** :\n"+sb;
    }
    public static void main(String arg[]){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the String ");
        String s = obj.nextLine();
        System.out.println(UpperCase(s));
        obj.close();
    }
}
