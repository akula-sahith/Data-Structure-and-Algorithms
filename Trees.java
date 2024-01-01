package DSA;
import java.util.*;
class BinaryTree{
 private  Node root; 
    class Node{
        int value;
        Node right;
        Node left;
        public Node(int value){
         this.value = value;
        }
    }
    public void DisplayTree(){
        DisplayTree(root,0);
    }
    public void DisplayTree(Node node,int level){
        if(node==null){
            return;
        }
        DisplayTree(node.right, level + 1);
        if(level!=0){
        for(int i=0;i<level-1;i++){
           System.out.print("|  ");
        }
        System.out.println("|-------->" + node.value);
        }else{
            System.out.println(node.value);
        }
        DisplayTree(node.left, level + 1);
    }
    public void populate(Scanner sc){
      System.out.print("Enter root node value: ");
      int val = sc.nextInt();
      root = new Node(val);
      populate(sc,root);
    }
    public void populate(Scanner sc,Node node){
       System.out.println("Want to enter left of" +" "+node.value);
       System.out.println("Enter true or false");
       boolean left = sc.nextBoolean();
       if(left){
        System.out.println("Enter value:");
        int value = sc.nextInt();
        node.left = new Node(value);
        populate(sc,node.left);
       }
       System.out.println("Want to enter right of" + node.value);
       System.out.println("Enter true or false");
       boolean right= sc.nextBoolean();
       if(right){
        System.out.println("Enter value:");
        int value = sc.nextInt();
        node.right = new Node(value);
        populate(sc,node.right);
       }

    }
}
public class Trees{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    BinaryTree tree = new BinaryTree();
    tree.populate(sc);
    tree.DisplayTree();
}
}