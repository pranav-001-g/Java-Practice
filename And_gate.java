package Simple_Codes;
import java.util.*;
public class And_gate{
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the no of cases : ");
        int n=obj.nextInt();
        
        int arr1[] = new int[100];
        int arr2[][] = new int[100][100];
        int arr3[] = new int[100];
        for(int i=0;i<n;i++){
            System.out.println("Enter the no of elements in case "+(i+1));
            arr1[i]=obj.nextInt();
        }

        for(int i=0;i<n;i++){
            System.out.println("Enter the elements in case "+(i+1));
            for(int j=0;j<arr1[i];j++){
                arr2[i][j]=obj.nextInt();
            }
        }

        System.out.println("2D matrix : ");
        for(int i=0;i<n;i++){
            for(int j=0;j<arr1[i];j++){
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println(" ");
        }

        System.out.println("Calculation : ");
        for(int i=0;i<n;i++){
            int c=1;
            for(int j=0;j<arr1[i];j++){
                if(arr2[i][j]==0){
                    c=0;
                    break;
                }
            }
            if(c==0){
                arr3[i]=0;
            }
            else{
                arr3[i]=1;
            }
        }

        for(int i=0;i<n;i++){
            System.out.println(arr3[i]);
        }
        obj.close();
    }
}
