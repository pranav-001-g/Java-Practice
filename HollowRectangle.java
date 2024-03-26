package Pattern;
import java.util.*;
public class HollowRectangle{
    public static void main(String arg[]){
        System.out.println("Enter hight and width of hollow rectangle pattern ");
        Scanner obj=new Scanner(System.in);
        int hight=obj.nextInt();
        int width=obj.nextInt();
        for(int i=0;i<hight;i++){
            for(int j=0;j<width;j++){
                if(i==0||i==(hight-1)||j==0||j==(width-1)){
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