package Simple_Codes;
import java.util.*;
public class Bit_even_odd {
    public static void main(String[] args) {
        int num;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number");
        int bit=obj.nextInt();
        num=bit&1;
        if(num==1){
            System.out.println("The number you enter is odd ");

        }
        else{
            System.out.println("The number you enter is even ");
        }

        obj.close();
    }
}
