package Simple_Codes;
import java.util.*;
public class factorial_for_loop {
    
    public static void main(String argu[]){
        Scanner obj=new Scanner(System.in);
        long fact,n;
System.out.println("enter number to find factorial ");
fact=obj.nextLong();
n=fact;
if(fact== 0){
    System.out.println("factorial is = "+1);
    
}
else if (fact <0){
    System.out.print("in this program factorial less than 0 not exit ");
}
else{
    for(int i=1;i<n;i++){
        fact =fact*i;
       
    }
    System.out.print("The factorial is = "+fact);
}

obj.close();
}
}