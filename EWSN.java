package Simple_Codes;
import java.util.*;
public class EWSN{
    public static void main(String arg[]){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the directions in capital letters without spaces :");
        String distanc=obj.next();
        int x=0;
        int y=0;
        for(int i=0;i<distanc.length();i++){
            char c =distanc.charAt(i);
            if(c=='E'){
                x++;
            }
            else if(c=='W'){
                x--;
            }
            else if(c=='N'){
                y++;
            }
            else {
                y--;
            }
        }
        
        System.out.println("The shortest distane between starting and ending point = "+ Math.sqrt((double)(x*x+y*y)));

        obj.close();
    }
}