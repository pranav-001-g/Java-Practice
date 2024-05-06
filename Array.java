package Simple_Codes;
import java.util.Scanner;
public class Array {
    public static void main(String argu[]) {
       try(Scanner ob=new Scanner(System.in)){
        
        int i, n, p;
        
        System.out.println("Enter the total number you want to input: ");
        n =ob.nextInt();
        int array[] = new int[n];

        System.out.println("Enter the numbers you want to store in the array and to calculate the sum: ");
        for (i = 0; i < n; i++) {
            array[i] = ob.nextInt();
        }

        System.out.println("Elements in the array in reverse order:");
        for (i = n - 1; i >= 0; i--) {
            System.out.println("Element at index " + i + ": " + array[i]);
        }

        p = 0; // Initialize p to 0 before sum calculation
        for (i = 0; i < n; i++) {
            p = p + array[i];
        }

        System.out.println("Sum of all elements: " + p);

       }
    //    catch(Exception e){
        // e.printStackTrace();
    //    }
    }
}
