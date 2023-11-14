package DSA;
import java.util.*;
public class PassByValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 1000;
        System.out.println(a);
        int b;
        b = a; //In this step we are assigning the value of a to b 
        System.out.println(b);
        b = 2000;//In this step we are updating the value of b to 2000
        System.out.println(b);
        System.out.println(a);/*even though we change the value of b it will 
       not affect a because a is separate value and b is separate value */
    }
}

