/*Method Overloading means we can create multiple functions with same but
they should differ in type of argument or number of argumnets
*/
/*At the compiling time the compiler will decide which function to call
 based on the inputs we passed
 */
package DSA;
import java.util.*;
public class MethodOverloading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        fun(5);
        fun("sahith");
    }
    static void fun(int a){
        System.out.println("Hey you called integer method");
    System.out.println(a);
    }
    static void fun(String a){
        System.out.println("Hey you called string function");
    System.out.println(a);
    } 
}
