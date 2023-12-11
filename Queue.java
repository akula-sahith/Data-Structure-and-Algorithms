package DSA;
import java.util.*;
class CustomQue{
    Scanner sc = new Scanner(System.in);
    private int data[];
    private final int DEFAULT_SIZE = 20;
    private int end = 0;
    public CustomQue() {
         this.data = new int[DEFAULT_SIZE];
    }
    public CustomQue(int size){
        this.data = new int[size];
    }
    public boolean insert(int value){
        if(isFull()){
            System.out.println("Cannot insert beacause the que is full!sorry");
            System.out.println("Enter 1 to go dynamic stack implementation");
            int temp = sc.nextInt();
            if(temp==1){
                dynamicinsertion();
            }
            else{
                return false;
            }
        }
       data[end] = value;
       end++;
       return true;
    }
    
    public void  remove(){
       if(isEmpty()){
        System.out.println("Cannot remove from an empty que");
        return;
       }

       for (int j = 0; j <end-1; j++) {
          data[j] = data[j+1];    
        }
       end--;
     
    }
    public boolean dynamicinsertion(){
      int[] temp = new int[data.length*2];
      for (int i = 0; i < data.length; i++) {
        temp[i] = data[i];
      }
      data = temp;
      return true;
    }
    public void display(){
        for (int i = 0; i < end; i++) {
            System.out.println(data[i]);
        }
    }
    public boolean isFull(){
        if(end==data.length){
           return true;
        }
        return false;
    }
    public boolean isEmpty(){
        if(end==0){
            return true;
        }
        return false;
    }
    
}
public class Queue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CustomQue que = new CustomQue(5);
        que.insert(5);
        que.insert(4);
        que.insert(3);
        que.insert(2);
        que.insert(1);
      //  System.out.println(que.insert(0));
       que.remove();
       // que.remove();
       //que.remove();
       // que.remove();
        // que.remove();
        que.display();
    }
}
