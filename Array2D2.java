package Simple_Codes;
import java.util.*;
public class Array2D2{
    public static void main(String[] argu){
        int a[][]=new int[90][90];
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter no of columns row:");
        int r=obj.nextInt();
        System.out.println("Enter no of colums:");
        int c=obj.nextInt();
        int row,col;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print("Enter element at "+(i+1)+" "+(j+1)+":");
                a[i][j]=obj.nextInt();
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("========================================================================");
        for(int i=0;i<r;i++){
            row=0;
            for(int j=0;j<c;j++){
                row=row+a[i][j];
            }
            System.out.println("sum of row "+i+" is = "+row);
            System.out.println("------------------------------------------------------------------------");
        }
        System.out.println("========================================================================");
        for(int i=0;i<r;i++){
            col=0;
            for(int j=0;j<c;j++){
                col=col+a[j][i];
            }
            System.out.println("sum of column "+i+" is = "+col);
            System.out.println("------------------------------------------------------------------------");
        }
        System.out.println("========================================================================");
        obj.close();
    }
}