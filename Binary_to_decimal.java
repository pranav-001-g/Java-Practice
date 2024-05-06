package Simple_Codes;
import java.util.*;
public class Binary_to_decimal {

    public static void main(String arg[]){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the binary number you want to convert into decimal ");
        long binary= obj.nextLong();
        int sum=0;
        int decimal;
        long Binary=binary;
        for(int i=0;binary!=0;i++) {
           
            decimal=(int)binary % 10;
            binary=binary/10;
            sum=sum+ (int)(decimal*Math.pow(2,i));
        
    }
        System.out.println("The Decimal number of "+Binary+" is = "+ sum );
        obj.close();
    }
}