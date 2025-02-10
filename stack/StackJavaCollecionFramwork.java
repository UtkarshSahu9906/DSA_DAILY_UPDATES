package stack;

import java.util.Stack;

public class StackJavaCollecionFramwork {
    public static void main(String[] args) {
        Stack<Integer>s=new Stack<>();
        s.push(22);
        s.push(13);

        s.push(23);

        s.push(25);
        s.push(28);
        s.push(47);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
