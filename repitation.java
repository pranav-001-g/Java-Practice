package Simple_Codes;
import java.util.*;
class test {
    public static void main(String argu[]){
        int a,b,flag=0;
        int array[]=new int[90] ;
        Scanner obj =new Scanner(System.in);
        System.out.println("Enter total number count : ");
        a = obj.nextInt();
        System.out.println("Enter "+ a +" elements ");
        for(int i=0;i<a;i++){
            array[i]=obj.nextInt();
        }
        for(int i=0;i<a;i++){
            b=array[i];
            for(int j=1;j<a-1;j++){
                if(b==array[i+1]){
                    flag=1;
                    System.out.println("False");
                    break;

                }
                else{
                    flag=0;
                }
            }
        }
        if(flag==0){
            System.out.println("True");
        }
      obj.close();          

    }
}