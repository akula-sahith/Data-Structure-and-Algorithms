package DSA;
import java.util.*;
class BST{
    private Node root;
    private class Node{
     private int height;
     private int value;
      Node right;
      Node left;
    public   Node(int value){
    this.value = value;
     } 
    }
    public void insertRoot(Scanner sc){
        System.out.println("Enter root node value:-");
        int value = sc.nextInt();
        root = new Node(value);
    }
    public void populate(int[] nums){
        for(int i = 0;i<nums.length;i++){
            insert(nums[i]);
        }
    }
    public void  inOrderTraversal(){
         inOrderTraversal(root);
    }
    private void inOrderTraversal(Node node){
        if(node==null){
            return;
        }
        inOrderTraversal(node.left);
        System.out.println("Node value = " + node.value);
        inOrderTraversal(node.right);
    }
    public void PreOrderTraversal(){
        PreOrderTraversal(root);
    }
    private void PreOrderTraversal(Node node){
        if(node==null){
            return;
        }
        System.out.println("Node value = " + node.value);
        PreOrderTraversal(node.left);
        PreOrderTraversal(node.right);
    }
    public void insert(int value){
       root =  insert(value, root);
    }
    private Node insert(int value,Node node){
        if(node==null){
           Node temp = new Node(value);
           return temp;
        }

        if(value<node.value){
            node.left = insert(value, node.left);
        }
        if(value>node.value){
            node.right = insert(value,node.right);
        }

        node.height = Math.max(Height(node.left),Height(node.right))+1;
        return node;
    }
    public boolean isbalanced(){
      return isbalanced(root);
    }
    private boolean isbalanced(Node node){
      if(node==null){
        return true;
      }


      return Math.abs(Height(node.left)-Height(node.right))<=1&&isbalanced(node.left)&&isbalanced(node.right);
    }
     public int Height(Node node) {
        if(node==null){
            return -1;
        }else{
            return node.height;
        }
    }
    public void DisplayTree(){
        DisplayTree(root,"Root Node:-");
    }
    public void DisplayTree(Node node,String details){
        if(node==null){
            return;
        }
        System.out.println(details + " " + node.value);
        DisplayTree(node.left,"Left child of"+ " " + node.value);
        DisplayTree(node.right,"Right child of"+ " " + " " + node.value);
    }
    public void postOrderTraversal(){
      postOrderTraversal(root);
    }
    public void postOrderTraversal(Node node){
      if(node==null){
        return;
      }
    postOrderTraversal(node.left);
    postOrderTraversal(node.right);
    System.out.println("Node value = " + node.value);
    }
    
}
public class BinarySearchTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BST tree = new BST();
        System.out.println("Enter how many values to insert in tree:-");
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        tree.populate(nums);
        tree.DisplayTree();
        System.out.println("Pre order traversal:-");
        tree.PreOrderTraversal();
        System.out.println("In order traversal:-");
        tree.inOrderTraversal();
        System.out.println("Post order traversal");
        tree.postOrderTraversal();
    }
}