package DSA;
import java.util.*;
//This an internal implementation of a LinkedList
class CLL{
    private int size=0;
    private Node head;
    private Node tail;
    class Node{
        
        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
        public Node(int value) {
            this.value = value;
        }
        int value;
        Node next;
    }
    public void DeleteNodeWithThisValue(int value){
        size--;
        Node start = head;
        if(start.value==value){
            head = head.next;
            tail.next = head;
            return;
        }
        do{
            Node current = start;
            if(start.next.value==value){

              start.next = start.next.next;
              return;
            }
            start = start.next;
        }while(start!=head);
        System.out.println("The node you want to delete is not found");
    }
    public void Delete(int index){
        size--;
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }
    public int getsize(){
        return size;
    }
    public void DisplayCLL(){
    Node temp = head;
    do{
        
        System.out.print(temp.value + "<>");
        temp = temp.next;
    }while(temp!=head);
    System.out.println(" " + "Circle continues");
    }
    public void Insert(int value){
        Node node = new Node(value);
        if(head==null){
            head = node;
            tail = node;
            size++;
            return;
        }
        node.next = head;
        tail.next = node;
        tail = node;
        size++;
    }
}
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
        if(start.next==null){
            System.out.println(start.value + "->" + null);
        }
        else{
        System.out.print(start.value +"<->");
        }
        last = start;
        start = start.next;
    }
    
   }
   public void AddAtLast(int value){
    if(head==null){
        Node node = new Node(value);
        head = node;
    }
    Node temp = head;
    while(temp.next!=null){
     temp = temp.next;
    }
    Node node = new Node(value);
    node.next = temp.next;
    temp.next = node;
    node.prev = temp;
    size++;
   }
   public void DisplayDoublyInReverseOrder(){
    Node start = head;
    Node last = null;
    while(start!=null){      
        last = start;
        start = start.next;
    }
    System.out.println("In reverse order");
    while(last!=null){
        System.out.print(last.value+"<-->");
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
    public void AddAtIndex(int index,int value){
        if(index==0){
            AddAtFirst(value);
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
             temp = temp.next;
        }
        Node node = new Node(value);
        node.next = temp.next;
        temp.next = node;
        node.prev = temp;
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
    //Merge two sorted lists;
   
    public void InsertUsingRecursion(int value,int index){ 
       recursivehelper(head, value, index, 0);
   }
   //Middle of the LinkedList
   public int MiddleList(LL list){
     Node fast = list.head;
     Node slow = list.head;
     while(fast.next!=null){
        fast = fast.next.next;
        slow = slow.next;
     }

     return slow.value;
   }
   public void recursivehelper(Node start,int value,int index,int i){
    if(i==size||i>size||i<0){
      System.out.println("Required index not found OR index out of bounds");
      return;
    }
    if(i==index-1){
        Node node = new Node(value);
        node.next = start.next;
        start.next = node;
        return;
     }

     recursivehelper(start.next, value, index, i+1);
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
     public LL MergeTwoLists(LL one,LL two){
        Node l1 = one.head;
        Node l2 = two.head;
        LL ans = new LL();
        while(l1!=null&&l2!=null){
            if(l1.value<l2.value){
                ans.InsertAtLast(l1.value);
                l1 = l1.next;
            }
            else{
                ans.InsertAtLast(l2.value);
                l2 = l2.next;
            }
        }
        while(l1!=null){
        ans.InsertAtLast(l1.value);
        l1 = l1.next;
        }
        while(l2!=null){
        ans.InsertAtLast(l2.value);
        l2 = l2.next;
        }

        return ans;
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
       /*  DLL list = new DLL();
        list.AddAtFirst(5);
        list.AddAtFirst(4);
        list.AddAtFirst(3);
        list.AddAtFirst(2);
        list.AddAtFirst(1);
        //list.AddAtIndex(1, 6);
        list.AddAtLast(7);
        list.AddAtIndex(5, 6);
        System.out.println(list.getsize());
        list.DisplayDoubly();*/
      //  list.DisplayDoublyInReverseOrder();
   /*    CLL list = new CLL();
      list.Insert(5);
      list.Insert(4);
      list.Insert(3);
      list.Insert(2);
      list.Insert(1);
      //list.Delete(4);
      list.DeleteNodeWithThisValue(5);
      int size =list.getsize();
      System.out.println(size);
      list.DisplayCLL();*/
      LL list1 = new LL();
      LL list2 = new LL();
      //list2.InsertAtLast(1);
    //  list2.InsertAtLast(2);
      list2.InsertAtLast(3);
      list2.InsertAtLast(4);
      list2.InsertAtLast(5);
      list2.InsertAtLast(6);
      list2.InsertAtLast(7);
      int ans = list2.MiddleList(list2);
     System.out.println(ans);
    }

    
}
