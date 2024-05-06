package Simple_Codes;
import java.util.*;
public class SwitchCase{
    public static void main(String[] argu){
    System.out.println("Enter two numbers :");
    int a,b;
    Scanner obj=new Scanner(System.in);
    a=obj.nextInt();
    b=obj.nextInt();
    char ch;
    do{
    
    System.out.println("============================== Manu =========================================");
    System.out.println("1.Multiplication");
    System.out.println("2.Addition");
    System.out.println("3.Subtraction");
    System.out.println("4.Division");
    System.out.println("5.exit");
    System.out.println("Enter your choice ");
    ch=obj.next().charAt(0);

    switch (ch) {
        case '1':
        System.out.println("=======================================================================");
            System.out.println("The multiplication of the number is "+a*b);
            System.out.println("=======================================================================");
            break;
        case '2':
        System.out.println("=======================================================================");
        System.out.println("The addition of the two number is "+(a+b));
        System.out.println("=======================================================================");
        break;
        case '3':
        System.out.println("=======================================================================");
        System.out.println("The differenc in the to number is "+(a-b));
        System.out.println("=======================================================================");
        break;
        case '4':
        System.out.println("=======================================================================");
        float c=(float)a/(float)b;
        System.out.println("The division of the two number is "+c);
        System.out.println("=======================================================================");
        break;
        case '5':
        System.exit(0);
            break;
    }}
    while(ch!=5);
    obj.close();
}
}