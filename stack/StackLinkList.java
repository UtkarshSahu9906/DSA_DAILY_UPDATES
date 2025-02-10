package stack;

public class StackLinkList {

    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;

        }

    }

    static class Stack {

        static Node head = null;

        public static boolean isEmpty() {
            return head == null;
        }

        //push
        public static void push(int data) {
            Node node = new Node(data);

            if (isEmpty()) {
                head = node;
                return;
            } else {

                node.next = head;
                head = node;
            }
        }

        public static int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;

        }
        public static int peek(){
            if(isEmpty()) return -1;
             return head.data;
        }
    }
    public static void main(String[] args) {
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
