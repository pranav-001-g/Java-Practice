package Simple_Codes;
import java.util.Scanner;
public class palindrome1{
   int n,R=0;
   int array[]=new int[15];
    palindrome1(){
     
    }
    palindrome1(int name){
        int o=name;
        while (name>0){
            int p=name%10;
            R=(R*10)+p;
            name=name/10;
 }
            if (o==R){
                System.out.println("The number " +o +" is palindrome");
            }
            else{
                System.out.println("The number " +o+" is not palindrome");
            }

       

    }
    public static void main(String arg[]){
         int name;
           Scanner obj=new Scanner(System.in);
       // System.out.println("enter the digit of number ");
        //n=obj.nextInt();
        System.out.println("enter the number to check is it palindrome or not upto 14 digit");
        name=obj.nextInt();

        palindrome1 o1 =new palindrome1(name);
        System.out.println(o1.n);
        obj.close();  
       
    }
}