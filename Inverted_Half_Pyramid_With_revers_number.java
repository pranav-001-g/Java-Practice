package Pattern;
import java.util.*;
public class Inverted_Half_Pyramid_With_revers_number{
    public static void main(String argu[]){
        Scanner obj=new Scanner(System.in);
        int num;
          System.out.println("enter the value of paterns ");
        num=obj.nextInt();
        for(int i=0;i<num;i++){
            for(int j =num;j>i;j--){
                System.out.print(j+" ");
            }
            System.out.println(" ");
        } obj.close();  
    }
}