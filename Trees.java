package DSA;
import java.util.*;
class BinaryTree{
    public BinaryTree(){

    }
   private class Node{
    int value;
    Node right;
    Node left;
    public Node(int value){
        this.value = value;
    }
   }
   private Node root;
    public void displaytree(){
        System.out.println(root.value);
        Node temp = root;
        helper(root);
    }
    public void helper(Node node){
        if(node.left==null||node.right==null){
            return;
        }
        System.out.println(node.left.value);
        System.out.println(node.right.value);
        node = node.left;
        helper(node);
        node = node.right;
        helper(node);
    }
   public void populate(Scanner sc){
    System.out.print("Enter the root value of the tree:");
    int value = sc.nextInt();
     root = new Node(value);
     populate(sc,root);
   }

 public void populate(Scanner sc, Node node) {
    System.out.println("Enter if you want to enter on the left of " + node.value);
    boolean left = sc.nextBoolean();
    if(left){
        System.out.println("Enter the value");
        int value = sc.nextInt();
        node.left = new Node(value);
        populate(sc,node.left);
    }
    System.out.println("Enter if you want to enter on the right of " + node.value);
    boolean right = sc.nextBoolean();
    if(right){
        System.out.println("Enter the value");
        int value = sc.nextInt();
        node.right = new Node(value);
        populate(sc,node.right);
    }
   // System.out.println("Populating process is ended");
}
}
class Trees{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();
        tree.populate(sc);
        tree.displaytree();
    }
}