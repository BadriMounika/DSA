public class LinkedList {
    static class Node{
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }
    public static Node head;
    public static void printLinkedList(Node head) {
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");    
    }
    public static void addAtFirst(int data){
       Node newNode = new Node(data);
       newNode.next=head;
       head = newNode;
    }
    public static void countNodes(){
        Node temp = head;
        int count = 0;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        System.out.println(count);
    }  
   public static void addAtLast(int data){
    Node temp = head;
    while(temp.next != null){
        temp = temp.next;
    }
    Node newNode = new Node(data);
    temp.next = newNode;
   }
   public static void deleteAtFirst(){
    head = head.next;
    }
    public static void deleteAtLast() {
        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;    
    }
    public static void main(String[] args) {
        head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);
        head.next.next.next.next=new Node(50);
        printLinkedList(head);
        addAtFirst(100);
        printLinkedList(head);
        countNodes();
        addAtLast(200);
        printLinkedList(head);
        deleteAtFirst();
        deleteAtLast();
        printLinkedList(head);
        }  
}
