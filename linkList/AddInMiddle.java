package linkList;

import java.lang.classfile.components.ClassPrinter;

public class AddInMiddle {

    public static Node head;
    public static Node tail;

    public class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public void addFirst(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }

    public void printLinkedList() {
        Node temp = head;
        if (temp == null) {
            System.out.println("null");
        }
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;

        }
        System.out.println("");
    }

    public void addNthIndex(int index, int data) {
        Node node1 = new Node(data);
        Node temp = head;
        int count = 0;
        while (count < index - 1) {
            temp = temp.next;
            count++;

        }
        node1.next = temp.next;
        temp.next = node1;

        System.out.println(head.data);
    }

    public void removeFirst(int count) {
        printLinkedList();
        for (int i = 1; i <= count; i++) {
            head = head.next;

        }
    }

    public Node getMidNodeOfList() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public void removeAfter(int position) {
        Node temp = head;
        int count = 1;
        while (true) {

            if (position == 0) {
                head = null;
                return;
            }
            if (count == position) {
                temp.next = null;
                return;

            }
            temp = temp.next;
            count++;

        }

    }

    public void removeLast() {
        Node temp = head;
        Node previous = null;
        while (temp.next != null) {
            previous = temp;
            temp = temp.next;
        }
        previous.next = null;
    }

    public int search(int val) {
        int idx = 0;
        while (head.next != null) {

            if (head.data == val) {
                return idx;
            }
            head = head.next;
            idx++;

        }
        return -1;
    }

    public int searchRecursivly(int val, Node head, int idx) {
        Node temp = head;
        if (head.next == null) {
            return -1;
        }
        if (head.data == val) {
            return idx;
        }
        return searchRecursivly(val, head.next, idx + 1);

    }

    public Node reverseLinkedList(Node list) {
        Node previous = null;
        Node curr = list;
        Node nxt;
        while (curr != null) { // Correct condition
            nxt = curr.next;   // Save the next node
            curr.next = previous; // Reverse the link
            previous = curr;   // Move 'previous' to the current node
            curr = nxt;        // Move 'curr' to the next node
        }
        list = previous; // Update the head of the reversed list
        return list;
    }

    public void removeNthNodeFromEnd(int NthTerm) {
        //calculate the size;
        Node temp = head;
        int sz = 1;
        while (temp.next != null) {
            temp = temp.next;
            sz++;
        }
        System.out.println("size: " + sz);
        temp = head;
        int count = 1;
        while (temp.next != null) {
            if (count == (sz - NthTerm)) {
                temp.next = temp.next.next;
            }
            temp = temp.next;
            count++;

        }
    }

    public void printLinkedList(Node list) {
        while (list != null) {
            System.out.print(list.data + "->");
            list = list.next;
        }
        System.out.println("\n");
    }

    public Node[] breckInTwo(Node node) {
        Node firstHlf = new Node(node.data);
        Node slow = node;
        Node fast = node;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            if (fast != null && fast.next != null) {
                firstHlf.next = slow.next;
            }
            slow = slow.next;

        }
        firstHlf.next = null;
        return new Node[]{firstHlf, slow};
    }

    public boolean isLinkedListPalindrome() {
        Node secondPart = reverseLinkedList(getMidNodeOfList());

        while (head.next != null) {
            if (secondPart.data != head.data) {
                
                return false;
            }
            secondPart =secondPart.next;
                head = head.next;

        }
        return true;

    }

    public static void main(String[] args) {
        AddInMiddle list = new AddInMiddle();

        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.addFirst(4);
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);

        list.breckInTwo(head);
 



        //list.add(3, 88);
        //System.out.println("Middle data: " + list.getMidNodeOfList().data);
//list.printLinkedList(list.getMidNodeOfList());
        //System.out.println("Result: " + list.searchRecursivly(889, head, 0));
        //list.printLinkedList(head);
        // list.removeNthNodeFromEnd(3);
        // Node[] lArr =list.breckInTwo(head);
        // System.out.print("------>\n");
        // list.printLinkedList(lArr[0]);
        // list.printLinkedList(lArr[1]);
        // System.out.println("------>");
        //list.reverseLinkedList();
//list .removeFirst(3);
//list.removeAfter(0);
        // list.removeLast();
        //list.printLinkedList();
        //System.out.println("Reverse: -> ");
        // list.printLinkedList(list.reverseLinkedList(head));
        //list.printLinkedList();
        // list.printLinkedList();
        //list.printLinkedList(list.reverseLinkedList(list.getMidNodeOfList()));
        //l//ist.printLinkedList();
       System.out.println(list.isLinkedListPalindrome());

        // list.removeLast();
        // list.printLinkedList();
        // list.removeLast();
        // list.printLinkedList();
        //System.out.println(list.search(88));
    }

}
