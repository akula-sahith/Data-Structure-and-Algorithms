package DSA;
import java.util.*;
public class FunctionsMethods{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  int ans =   sum();
  System.out.println(ans);
  int num = sc.nextInt();
   int an = modifynumber(num);
  System.out.println(an);
  int num1 = sc.nextInt();
  int num2 = sc.nextInt();
    System.out.println("Before Swapping");
    System.out.println("num1" + num1);
    System.out.println("num2" + num2 );
    swap(num1,num2);
    System.out.println("After Swapping");
    System.out.println("num1" + num1);
    System.out.println("num2" + num2);
}
static void swap(int a ,int b){
    int temp = a;
    a = b;
    b = temp;
}
static int sum(){
    Scanner in = new Scanner(System.in);
    int num1 = in.nextInt();
    int num2 = in.nextInt();
    int sum = num1 + num2;
    return sum;  //this code ends here so basicaly the next statement will not sun;
  // System.out.println("this statement is unreachable");
}
static  int modifynumber(int x){
    x = x + 1;
    return x;
}
}