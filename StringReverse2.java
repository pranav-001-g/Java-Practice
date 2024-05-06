package Simple_Codes;
import java.util.*;
public class StringReverse2{ 
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter any string : ");
        String str = obj.nextLine();
        int j=0;
        int p=0;
        int k=0;
        int arr2 [] = new int [100];
        char arr[]=new char[100];
        char res[]=new char[100];
        
       arr=str.toCharArray();
       
        for(int i=0;i<str.length();i++){
            if(arr[i]==' '){
                arr2[j]=i;
                j++;
            }
        }
        arr2[j]=str.length();

        for(int i=0;i<str.length();i++){
            if(arr[i]==' '){
                res[i]=' ';
            }
        }

        for(int i=0;i<str.length();i++){
            for(int a=(arr2[i]-1);a>=p;a--){
                res[k]=arr[a];
                k++;
            }
            if(res[k]==' '){
                k++;
            }    
            p=(arr2[i]+1);
        }

        for(int i=0;i<str.length();i++){
            System.out.print(res[i]);
        }
         obj.close();
    }


   
    /*public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a string ");
        String str = obj.nextLine();
        String str2[]=str.split(" ");
        for(String a: str2){
            StringBuffer obj2 = new StringBuffer(a);
            obj2.reverse();
            System.out.print(a+" ");
        }
        
    }*/
}
