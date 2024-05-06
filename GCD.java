package Simple_Codes;
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        int i=2,j=0;
        int a,b,c,d=1;
        int array1[]=new int[100];
        Scanner obj=new Scanner(System.in);
         System.out.println("enter first number ");
        a=obj.nextInt();
        System.out.println("enter second number ");
        b=obj.nextInt();
       
        if (a>b){
            c=b;
        }
        else{
            c=a;
        }
       while(i<c){
           if(a%i==0 && b%i==0){
               
               array1[j]=i;
               a=a/i;
               b=b/i;
               j++;
               
               }
               else{
                   i++;
               }
           }
           for(int k=0;k<j;k++){
               d=d*array1[k];
           }
          System.out.println("The gcd number is "+d);  
         obj.close();  
    }
}