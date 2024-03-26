package Pattern;
import java.util.*;
public class Inverted_Half_Pyramid_With_number {

    public static void main(String arg[]){
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter the value to print Inverted Half Pyramid with number : \n");
        int num =obj.nextInt();

        for(int i=1;i<=num;i++)
        {
            for(int j=num;j>=i;j--){
                System.out.print(num-j+1+" ");
            }
            System.out.println();
        }
        obj.close();
    }
}