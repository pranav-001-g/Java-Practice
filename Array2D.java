package Simple_Codes;
import java.util.*;
public class Array2D{
    public static void main(String argu[]){
        int n,m;
        Scanner obj=new Scanner(System.in);
        int array[][]=new int[15][15];
        System.out.println("enter the row ");
        n=obj.nextInt();
                System.out.println("enter the column ");
        m=obj.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.println("enter the element at "+i+"."+j+" = ");
                array[i][j]=obj.nextInt();
            }
        }  
             for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(array[i][j]+" ");
               
            }
            System.out.print("\n");
        } 
        
        System.out.println("===============ROWS=================");
        for(int i=0;i<n;i++){
              System.out.print("addition of rows "+ (i) +" = ");
              int q=0;
            for(int j=0;j<m;j++){
                q=q+array[i][j];
                
            }
            System.out.println(q);
             
        }
            System.out.println("===============COLOUMN=================");
         for(int i=0;i<n;i++){
              System.out.print("addition of coloum "+ (i) +" = ");
              int q=0;
            for(int j=0;j<m;j++){
                q=q+array[j][i];
                
            }
            System.out.println(q);
             
        }
        obj.close();
    }

}