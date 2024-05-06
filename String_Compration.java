package Simple_Codes;
import java.util.*;
public class String_Compration {

    static String Compration(String s)
    {
        StringBuilder sb=new StringBuilder(s);
        StringBuilder sb1=new StringBuilder();
        
        for(int i=0;i<s.length();i++){
            int count=1;
            char c =sb.charAt(i);
            if(c!='*'){
                
            for(int j=i+1;j<s.length();j++){
                if(c==sb.charAt(j)){
                    count++;
                    sb.setCharAt(j, '*');
                }
            }
            sb1.append(c);
            sb1.append(count);

            
        }
    }
    s=sb1.toString();
    return s;
}
    public static void main(String[] args)
    {
        Scanner obj =new Scanner(System.in);
        System.out.println("Enter the string :");
        String str=obj.nextLine();
        System.out.println(Compration(str));
        obj.close();
    }
}