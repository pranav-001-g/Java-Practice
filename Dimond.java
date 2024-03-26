package Pattern;
import java.util.*;
public class Dimond {
    public static void main(String[] args) {
        int Dimond;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the value to print dimond pattern :");
        Dimond=obj.nextInt();
        for(int i=1;i<=Dimond;i++)
        {
            for(int j=Dimond-i;j>=1;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();

        }
        for(int i=Dimond;i>=1;i--)
        {
            for(int j=Dimond-i;j>=1;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();

        }
        obj.close();
    }
}
