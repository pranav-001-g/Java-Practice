package Simple_Codes;
import java.util.*;
public class Stein_Gcd{
   
    int gcd(int x,int y){
        int min,d=1;
        if(x>y){
            min=y;
        }
        else{
            min=x;
        }
        for(int i=1;i<=min;i++){
            if(x%i==0 && y%i==0){
                d=i;
            }
        }
        return d;
    }
    
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        int a,b;
        Stein_Gcd obj1 = new Stein_Gcd();
        System.out.println("Enter any 2 numbers : ");
        a=obj.nextInt();
        b=obj.nextInt();
        if(a==b){
            System.out.println(a);
        }
        else if(a==0){
            System.out.println(b);
        }
        else if(b==0){
            System.out.println(a);
        }
        else{
            if(a%2==0 && b%2==0){
                System.out.println(2*(obj1.gcd(a/2,b/2)));
            }
            else if(a%2!=0 && b%2==0){
                System.out.println(obj1.gcd(a,b/2));
            }
            else if(a%2==0 && b%2!=0){
                System.out.println(obj1.gcd(a/2,b));
            }
            else{
                int c=Math.abs(a-b);
                System.out.println(obj1.gcd(c/2,b));
            }
        }
        obj.close();
    }
}    
