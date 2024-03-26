package Pattern;
import java.util.*;
public class Palindromic_Number {
    public static void main(String arg[]){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=n-i;j>=1;j--){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);

            }
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        obj.close();
    }
}
