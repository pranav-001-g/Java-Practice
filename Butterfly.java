package Pattern;
import java.util.*;
public class Butterfly {
    public static void main(String arg[]){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter number :");
        int n=obj.nextInt();
        for(int i=1;i<=n/2+1;i++){
            for(int j=0;j<=n;j++){
                if(j<i||j>=n-i+1){
                    System.out.print(" *");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
         for(int i=n/2+1;i>=1;i--){
            for(int j=0;j<=n;j++){
                if(j<i||j>=n-i+1){
                    System.out.print(" *");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        obj.close();
    }
}
