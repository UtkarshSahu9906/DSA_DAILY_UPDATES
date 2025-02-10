package linkList;


public class AddFirst {
    public static Node head;
    public static Node tail;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Add a node at the beginning of the list
    public void addFirst(int data) {
        //step1  create a new node
       Node newNode = new Node(data);
       if(head ==null){
        head =tail=newNode;
        return;
       }
       //step2 -newNode next = head
       newNode.next =head;
       //step3 head = newnode

       head = newNode;
    }
    public void addLast(int data){
        Node newNode =new Node(data);
        if(head ==null){
            head =tail = newNode;
            return;
        }
        tail.next =newNode;

        tail = newNode;
    }

    public void printLinkedList(){
        Node temp =head;

        while(temp!=null){
            System.out.print(temp.data);
            temp = temp.next;

        }
    }

    // Helper method to display the linked list
   

    public static void main(String[] args) {
        AddFirst list = new AddFirst();
        list.addFirst(1);
        list.printLinkedList();


        list.addFirst(2);        list.printLinkedList();

        list.addFirst(3);        list.printLinkedList();

        list.addFirst(4);        list.printLinkedList();

        list.addFirst(5);        list.printLinkedList();

        list.addLast(10);        list.printLinkedList();

        list.addLast(11);        list.printLinkedList();
       



        


       
        
      
    }
}
