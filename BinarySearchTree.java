
    import java.util.*;
import java.util.LinkedList;
public class BinarySearchTree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int d){
            int data=d;
            left=null;
            right=null;
        }
    }
    public static Node root;
    public static Node searchBST(Node root,int val){
        if(root==null) return null;
        if(root.data==val) return root;
        if(val<root.data) return searchBST(root.left, val);
        else return searchBST(root.right, val);
    }
    public static void main(String[] args) {
        root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        System.out.println(searchBST(root, 4));
        
    }
}
