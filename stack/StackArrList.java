package stack;
import java.util.ArrayList;

public class StackArrList {
    static class Stack{
        static ArrayList<Integer> list = new ArrayList<>();
        public static boolean isEmpty(){
            return list.size()==0;
        }
        //push
        public static void push(int data){
            list.add(data);
        }
        //pop
        public static int pop(){
            if(isEmpty()) return -1;
            int top =list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }
        //peek
        public static int peek(){
            if(isEmpty()) return -1;

            return list.get(list.size()-1);
        }

    }
    public static void main(String args[]){
      Stack s=new Stack();
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
