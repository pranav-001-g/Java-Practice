package Simple_Codes;
import java.util.*;
public class Array2D3 {
    public static void main(String[] args) {
        int array[][] =new int[100][100];
        int n = 0;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter 9 elements ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                array[i][j]=obj.nextInt();
            }
        }
        System.out.println("Your 2d array is");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
         System.out.println("Sum of digonal element is :");
         for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(i==j){
                    System.out.print(array[i][j]+" ");
                    n = array[i][j] + n;
                }
            }
        }
       System.out.println(" = ");
        System.out.println(n);
        n=0;
         System.out.println("Sum of antidigonal element is :");
         for(int i=0;i>3;i++){
            for(int j=0;j>3;j++){
                if(i+j==2){
                      System.out.print(array[i][j]+" ");
                    n = array[i][j] + n;
                }
            }
        }
         System.out.println(" = ");
        System.out.println(n);
        obj.close();
    }
}
