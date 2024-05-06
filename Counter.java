/*1. Prompt the user to enter a text or provide a file to count the words.
2. Read the input text or file and store it in a string.
3. Split the string into an array of words using space or punctuation as delimiters.
4. Initialize a counter variable to keep track of the number of words.
5. Iterate through the array of words and increment the counter for each word encountered. 6. Display the total count of words to the user.
You can further enhance the project by adding features such as:
7. Ignoring common words or stop words.
8. Providing statistics like the number of unique words or the frequency of each word. 9. Implementing input validation to handle empty inputs or file errors.
10. Adding a graphical user interface (GUI) for a more user-friendly experience. */
package Simple_Codes;
import java.util.Scanner;
class Counter{
    public static void main(String argu[]){
      int cf=0;
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the text:");
        String t =in.nextLine();
        String array[]=new String[100];
        String array1[]=new String[100];
        String temp="";
        int count=0;
        int j=0;
       
       for(int i=0;i<t.length();i++){
           temp=temp+t.charAt(i);
         if(t.charAt(i)==' '|| i==t.length()-1){
            array[j]=temp;
            array1[j]=temp;
            j++;
            temp="";
            count=count+1;
         }
       }
      
       
       for(int i=0;i<count-1;i++){
          cf=1;
        for(int k=i+1;k<count;k++){
          if(array1[i].equals(array1[k])){
            if(array1[i].equals("**")){
              break;
            }
            cf=cf+1;
            array1[k]="**";
          }
          
        }
       if(!array1[i].equals("**")){
          
          System.out.println("Frequency is "+array1[i]+" "+cf);
        }
       }
       if(!array[count-1].equals("**")){
        System.out.println("Frequency is "+array1[count-1]+" " + cf);
      }
       System.out.println("=======================================================");
       System.out.println("The List Of Words Present In The Array:");
       for(int i=0;i<count;i++){
         System.out.println((i+1)+". "+array[i]);
       }
       System.out.println("=======================================================");
       System.out.println("Total count of words in a string is :\n"+count);
    in.close();
    }
}