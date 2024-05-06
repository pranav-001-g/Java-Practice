package Simple_Codes;
import java.util.*;
class sort{
    public static void main(String[] args) {
        int array[]=new int[10];
        int n=0;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter nine element :");
        for(int i=0;i<=8;i++){
            array[i]=obj.nextInt();

        }
        for(int i=0;i<=8;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
        System.out.println("The Greatest nunber in the array is ");
        
        for(int i=0;i<=8;i++)
        {
           for(int j=i+1;j<=9;j++)
           {
            if(array[j]>array[i])
            {
                n=array[i];
                array[i]=array[j];
                array[j]=n;
            }
           }
        }
        System.out.println(array[0]);
        obj.close();
    }
}