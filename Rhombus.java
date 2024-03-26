package Pattern;
import java.util.*;
public class Rhombus {
    public static void main(String[] args) {
        int base;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the value of the base:");
        base=obj.nextInt();
        for(int i=1;i<=base;i++){
            for(int j=0;j<base-i;j++){
                System.out.print("  ");
            }
            for(int j=0;j<base;j++){
                System.out.print("[]");
            }
            System.out.println();
        }
            obj.close();
    }
}
