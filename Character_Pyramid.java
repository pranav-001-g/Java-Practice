package Simple_Codes;
import java.util.*;
class Character_Pyramid {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number of lines should be printed on it: ");
        int n=obj.nextInt();
        char ch='A';
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
        obj.close();
    }
}