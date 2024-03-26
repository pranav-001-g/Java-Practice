package Pattern;
import java.util.*;
public class Inverted_Rotated_Half_Pyramid {

    public static void main(String arg[]){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the value of row and coloum : ");
        int row=obj.nextInt();
        int coloum=obj.nextInt();
        for(int i=1;i<=coloum;i++){
            for(int j=1;j<=row-i;j++){
                System.out.print(" ");
            }
            
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        obj.close();
    }
}