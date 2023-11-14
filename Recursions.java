package DSA;
import java.util.*;
public class Recursions {
    Scanner sc = new Scanner(System.in); 
 public static void main(String[] args) {
   
    //recursion is nothing a function calling itself
    //for example write a recursive function for printing 1 to n numbers
    //print 1 to 5;
    print(1);
 }   
 static void print(int n){
   /*if there is a return type make sure that you return whatever you get
   everytime you call the funtion
    */
    System.out.println(n);
    if(n==5){ //->this is the condition where function stops calling(base comdition)
        return;
    }
    print(n+1);//->function calling itself
    
 }
}
