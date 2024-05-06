package Simple_Codes;
// import java.util.*;
public class Power_optimal {

    static int power(int a,int n){
        if(n==0){
            return 1;
        }
        int halfexpo=power(a,n/2);
        int squre=halfexpo*halfexpo;

        if(n%2!=0){
            squre=squre*a;
        }
        return squre;
    }
    public static void main(String[] args) {
        System.out.print(power(2, 2));
    }
}