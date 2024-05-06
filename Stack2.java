package Simple_Codes;

import java.util.Stack;

public class Stack2 {
    public static void main(String[] args) {
         Stack<Integer> s = new Stack<>();
        s.add(9);
        System.out.println(s);
        System.out.println(s.isEmpty());
        System.out.println(s.empty());
        System.out.println(s.remove(0));
        System.out.println(s.isEmpty());
        System.out.println(s.empty());
        s.add(8);
        s.add(8);
        s.add(8);
        s.add(8);
        System.out.println(s);
        s.add(0, 9);
        System.out.println(s);
        s.remove(1);
        System.out.println(s);
    }
}
