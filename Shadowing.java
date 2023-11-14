package DSA;
import java.util.*;
public class Shadowing {
    static int y = 50;
    static int x = 40;/*this variable can be used in any static function */
                      /*this is called class variable */
                      /*this variable will be shadowed or dominated at line 11 */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(x);
        int x = 80;/*this shadows the variable at line 5 */
              int y;    /*the shadowing starts when the variable is declared */
              System.out.println(y);/*->this gives me an error as i am tryin
              to access y without initializing */
        System.out.println(x);
        print();
    }
    static void print(){
        System.out.println(x);
    }
}
