package Simple_Codes;
import java.util.*;
public class Array2D1{
    public static void main(String argu[]){
        int n,m;
        Scanner obj=new Scanner(System.in);
        int array[][]=new int[15][15];
        System.out.print("enter the row ");
        n=obj.nextInt();
                System.out.print("enter the column ");
        m=obj.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print("enter the element at "+i+"."+j);
                array[i][j]=obj.nextInt();
            }
        }  
             for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.println("enter the element at "+i+" . "+j+" is "+ array[i][j]);
               
            }
        }   obj.close();          
    }

}