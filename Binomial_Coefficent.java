package Simple_Codes;
import java.util.*;
class Binomial_Coefficent 
{
    static int factorial(int n){
        if(n<=1){
            return 1;
        }
        n=n*factorial(n-1);
        return n;
    }
   public static void main(String[] args) 
{
    Scanner obj=new Scanner(System.in);
    System.out.println("Enter the value of n: ");
    int n=obj.nextInt();
   System.out.println("Enter the value of r: ");
    int coef;
    int r=obj.nextInt();
    coef=factorial(n)/(factorial(r)*factorial(n-r));
    System.out.println("The factorial of n="+n+" is "+factorial(n));
    System.out.println("The factorial of r="+r+" is "+factorial(r));
    System.out.println("The Binomial Coefficient value of n="+n+" and r="+r+" is ="+coef);
    obj.close();
}

   
}