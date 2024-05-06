package Simple_Codes;
import java.util.*;
public class FunctionRecurtion{
    int fact(int n){
        if(n<1){
            return 1;
        }
        else{
            return n*fact(n-1);
        }
    }
    public static void main(String arg[]){
        Scanner obj=new Scanner(System.in);
        FunctionRecurtion o=new FunctionRecurtion();
        int n;
        System.out.println("Enter the number for which you want to find the factorial ");
        n=obj.nextInt();
        System.out.println("The factorial of "+n+" is "+o.fact(n));

        obj.close();  
    }
}