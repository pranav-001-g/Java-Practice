// here is the code of task 2 where i had done a program of storing the word in array by removing the non-characters.
//  And one more important thing is that i had calculated total number of words.
package Simple_Codes;
import java.util.*;
public class Task2{
    public static void main(String argu[]){
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the text");
        String t =in.nextLine();
        String array[]=new String[t.length()];
        String temp="";
        int count=0;
        int j=0;
       for(int i=0;i<t.length();i++){
          
        char currentChar = t.charAt(i);
         if(t.charAt(i)==' '|| i==t.length()-1)
         {
            if(Character.isLetter(currentChar)){
                temp=temp+currentChar;
            }
            array[j]=temp;
            j++;
            temp="";
            count=count+1;
            }
        else if(!Character.isLetter(currentChar))
        {
            array[j]=temp;
            j++;
            temp="";
            count=count+1;
            do{
                i++;
            }while(Character.isLetter(currentChar));
            
            }
        else{
         temp=temp+t.charAt(i);
        }
        
       }
       System.out.println("=======================================================");
       System.out.println("Printing the words from the array ");
       for(int i=0;i<count;i++){
         System.out.println((i+1)+". "+array[i]);
       }
       System.out.println("=======================================================");
       System.out.println("Total count of words in a string is = "+count);
    in.close();
    }
}
// in this code the input can be taken as a string of any length , i have taken a sample input as follow.
// this sample input is :- They are: the period, question mark, exclamation point, comma, colon, semicolon, dash, hyphen, brackets, braces, parentheses, apostrophe, quotation mark, and ellipsis.
// lets run the code.
// the out put we get is : Total count of words in a string is = 21