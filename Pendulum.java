package Simple_Codes;
import java.util.*;
public class Pendulum{
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        int n,temp,mid;
        System.out.println("Enter no of elements : ");
        n = obj.nextInt();
        int arr[] = new int[100];
        int arr1[] = new int[100];
        System.out.println("Enter the elements : ");
        for(int i=0;i<n;i++){
            arr[i]=obj.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.print(arr[i]+" ");     
        }
         if(n%2==0){
            mid = n/2-1;
          }
        else{
          mid = (n-1)/2;
        }
        int a=mid;
        int b=mid;
        for(int i=0;i<n;i++){
            if(i==0){
                arr1[mid]=arr[0];
            }
            else{
                if((i%2)==0){
                    arr1[a-1]=arr[i];
                    a=a-1;
                }
                else{
                    arr1[b+1]=arr[i];
                    b=b+1;
                }
            }
        }
        System.out.println("\n******PENDULUM ARRANGMENT******");
        for(int i=0;i<n;i++){
            System.out.print(arr1[i]+" ");
        }
        obj.close();  
    }
}
       
    