package Simple_Codes;
import java.util.*;
public class linner_search{
    public static void main(String arg[]){
        int flag=0;
        Scanner obj=new Scanner(System.in);
        int array[]=new int[100];
        System.out.println("Enter the size of array ");
        int a=obj.nextInt();
        System.out.println("enter "+a+" elements in array ");
        for(int i=0;i<a;i++){
            array[i]=obj.nextInt();
        }
        System.out.println("enter the number to search ");
        int key=obj.nextInt();
        for(int i=0;i<a;i++){
            if(array[i]==key){
                System.out.println("the element is found at "+(i+1)+" th position ");
                flag=1;
                break;
            }
        }
        
            if(flag==0){
                System.out.println("the element is not found ");
            } obj.close();  
        }
    }
