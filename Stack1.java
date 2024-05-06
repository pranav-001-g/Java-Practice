package Simple_Codes;
import java.util.Stack;
public class Stack1 {

    public static void main(String arg[]){
        Stack<Integer>s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(90);
        s.push(3);
        s.push(4);
        s.push(5);
        System.out.println(s);

        while (!s.isEmpty()) {
            System.out.print(s.peek()+" ");
            s.pop();
        }
    }
    
}
