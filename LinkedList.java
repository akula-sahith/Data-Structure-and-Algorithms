package DSA;
import java.util.*;
 class LL{
    private int size;
    private Node head;
    private Node tail;
    public LL(){
        this.size = 0;
    }
    public LL(int size) {
        this.size = size;
    }
    public int size(){
        return this.size;
    }
    public void DisplayList(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value + "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void InsertAtLast(int value){
        Node node = new Node(value);
        if(tail==null){
            InsertAtFirst(value);
            return;
        }
        tail.next = node;
        tail = node;
        size++;
    }
    public void InsertAtFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;
        if(tail==null){
            tail = head;
        }
        size++;
    }
    private class Node{
        int value;
        Node next;
        public Node(int value) {
            this.value = value;
        }
        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
        
    }
 
}
public class LinkedList {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        LL list = new LL();
        list.InsertAtFirst(5);
        list.InsertAtFirst(4);
        list.InsertAtFirst(3);
        list.InsertAtFirst(2);
        list.InsertAtLast(1);
        System.out.println("size of list ="+" "+ list.size());
        list.DisplayList();
    }
}
