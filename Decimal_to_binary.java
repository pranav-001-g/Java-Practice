package Simple_Codes;
import java.util.*;
public class Decimal_to_binary {

    public static void main(String arg[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the Decimal number to convert into binary");
        long decimal=obj.nextInt();
        long remainder;
        StringBuffer binary=new StringBuffer();
        while (decimal!=0) {
            remainder=decimal%2;
            binary.insert(0, remainder);
            decimal=decimal/2;
        }
        System.out.println("The binary number after conversion from decimal = "+binary);
        obj.close();
    }
}