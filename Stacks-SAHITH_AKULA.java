package DSA;
import java.util.*;
class DynamicStack extends CustomStack{
    public DynamicStack(int size){
        super(size);
    }
     public DynamicStack(){
        super();
    }
    @Override
    public boolean push(int item) throws Exception {
        // TODO Auto-generated method stub
       if(this.isFull()){
        int[] temp = new int[data.length*2];
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
       }

       return super.push(item);
    }
    
   

}
class  CustomStack{
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    private int  ptr = -1;
    public CustomStack() {
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size) {
        this.data = new int[size];
    }
    
    public boolean push(int item) throws Exception{
        if(isFull()){
            throw new Exception("Cannot insert into a full stack");
        }
      ptr++;
      data[ptr] = item;
      return true;
    }
    public int poop() throws Exception{
      if(isEmpty()){
        throw new Exception("Cannot remove from empty stack");
      }

      return data[ptr--];
    }
    public boolean isFull() {
        if(ptr==data.length-1){
        return true;
        }

        return false;
    }
    private boolean isEmpty() {
        if(ptr==-1){
        return true;
        }

        return false;
    }
     
}
public class Stacks {
    public static void main(String[] args) throws Exception {
        CustomStack stack = new DynamicStack(5);
        System.out.println(stack.push(91));
        stack.push(92);
        stack.push(93);
        stack.push(94);
        stack.push(95);
        stack.push(100);
        System.out.println(stack.poop());
        System.out.println(stack.poop());
        System.out.println(stack.poop());
        System.out.println(stack.poop());
        System.out.println(stack.poop());
        System.out.println(stack.poop());

    }
}
