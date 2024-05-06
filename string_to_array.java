package Simple_Codes;
import java.util.Scanner;
class string_to_array{
    public static void main(String[] args) {
        System.out.println("Converting string to array ");
        //char ch[]=str.toCharArray(); 
        String s;
        Scanner obj=new Scanner(System.in);
        s=obj.nextLine();
        char array[]=new char[s.length()];
        for(int i=0;i<s.length();i++){
           array[i]=s.charAt(i);
        }
        for(int i=0;i<s.length();i++){
          System.out.println(array[i]);
        }
        obj.close();
    }
}