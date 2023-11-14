package DSA;
import java.util.*;
public class BlockScope {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 5;
        int b = 6;
        //let us consider the dwon 2 calribraces represent a block
        {
          int a = 5; /*->This shows an error as a is declared already
           it cannot be initialized again*/
           a = 55;/*->you can modify it */
          int c = 55;
        }
        System.out.println(c);/*-> you cannot acces the
         variable which is declared inside block*/
    }
}
