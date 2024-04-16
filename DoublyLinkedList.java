import java.util.ArrayList;
public class DoublyLinkedList {
    static class Node{
        int data;
        Node next;
        Node prev;
         
        Node(int d){
            data=d;
            next=null;
            prev=null;
        }
    }
    public static Node head;
    public static void printDLL(){
        Node temp=head;
        System.out.print("null->");
        while(temp!=null){
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static ArrayList<ArrayList<Integer>> pairsWithGivenSum(int target,Node head){
        Node right=head;
        Node left=head;
        ArrayList<ArrayList<Integer>> result=new ArrayList<>();
        while(right.next!=null) right=right.next;
        while(left.data<right.data){
            if(left.data+right.data==target){
                ArrayList<Integer> al=new ArrayList<>();
                al.add(left.data);
                al.add(right.data);
                result.add(al);
                left=left.next;
                right=right.prev;
            }
            else if(left.data+right.data<target) left=left.next;
            else right=right.prev;
        }
        return result;
    }
    public static Node reverseDLL(Node head){
       Node prev=null;
        Node curr=head;
        if(head==null || head.next==null) return head;
        while(curr!=null){
            prev=curr.prev;
            curr.prev=curr.next;
            curr.next=prev;
            curr=curr.prev;
        }
        return prev.prev;
    }
    public static void main(String[] args) {
        head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=new Node(5);
        head.next.prev=head;
        head.next.next.prev=head.next;
        head.next.next.next.prev=head.next.next;
        head.next.next.next.next.prev=head.next.next.next;
        printDLL();
        reverseDLL(head);
        System.out.println(pairsWithGivenSum(5, head));
    }
}

