package DSA;
import java.util.*;
//This an internal implementation of a LinkedList
class DLL{
    private int size;
    private Node head;
    
    public int getsize(){
        return size;
    }
   public void DisplayDoubly(){
    Node start = head;
    Node last = null;
    System.out.println("In order");
    while(start!=null){
        System.out.print(start.value +"<->");
        last = start;
        start = start.next;
    }
    System.out.println();
    System.out.println("In reverse order");
    while(last!=null){
        System.out.print(last.value+"<->");
        last = last.prev;
    }
   }
    public void AddAtFirst(int value){
        Node node = new Node(value);
        node.next = head;
        if(head!=null){
            head.prev = node;
        }
        head = node;
        node.prev = null;
        
        size++;
    }
    private class Node{
      int value;
      Node next;
      Node prev;
    public Node(int value) {
        this.value = value;
    }
    public Node(int value, Node next, Node prev) {
        this.value = value;
        this.next = next;
        this.prev = prev;
    }
    public Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }
      
    }
}
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
    public void DeleteAtFirst(){
        head = head.next;
        if(head==null){
            tail=null;
        }        
       
        size--;
    }
    public void DeleteAtLast(){
        Node second = getNode(size-2);
        if(size<=1){
            DeleteAtFirst();
            return;
        }
        tail = second;
        tail.next = null;
        size--;
    }
    public Node getNode(int index){
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }
    public void DeleteAtIndex(int index){
        if(index==0){
            DeleteAtLast();
            return;
        }
        if(index==size-1){
            DeleteAtFirst();
            return;
        }
       Node prev = getNode(index-1);
       prev.next = prev.next.next;
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
    public Node FindNode(int value){

     Node temp = head;
     while(temp!=null){
        if(temp.value==value){
            return temp;
        }
        temp = temp.next;
     }
    return null;
    }
    public void InsertAtPosition(int value,int index){
      if(index>size||index<0){
        if(index<0){
            System.out.println("Index must be greater than zero");
        }
        else{
            System.out.println("Index out of bounds");
        }
      }
      if(index==0){
        InsertAtFirst(value);
        return;
      }
      if(index==size){
        InsertAtLast(value);
        return;
      }
      Node temp = head;
      for (int i = 1; i < index; i++) {
        temp = temp.next;
      }
      Node node = new Node(value,temp.next);
      temp.next = node;
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
       /*  LL list = new LL();
        list.InsertAtFirst(3);
        list.InsertAtFirst(4);
        list.InsertAtFirst(5);
        list.InsertAtFirst(7);
        list.InsertAtLast(8);
        list.InsertAtPosition(6, 3);
        list.DisplayList();
        list.DeleteAtFirst();
        System.out.println("size of list ="+" "+ list.size());
        list.DisplayList();
        list.DeleteAtLast();
         System.out.println("size of list ="+" "+ list.size());
        list.DisplayList();
         list.DeleteAtIndex(1);
         System.out.println("size of list ="+" "+ list.size());
        list.DisplayList();*/
        DLL list = new DLL();
        list.AddAtFirst(5);
        list.AddAtFirst(4);
        list.AddAtFirst(3);
        list.AddAtFirst(2);
        list.AddAtFirst(1);
        System.out.println(list.getsize());
        list.DisplayDoubly();
    }
}
