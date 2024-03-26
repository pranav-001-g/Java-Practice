package Pattern;
import java.util.*;
public class Hollow_Rhombus {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the value of n to print the Hollo Rhombus: ");
        int n=obj.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=n-i;j>=1;j--){
                System.out.print(" ");

            }
            for(int j=1;j<=n;j++){
                if(j==1||i==1||j==n||i==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
        obj.close();
    }
}
