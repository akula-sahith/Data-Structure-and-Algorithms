package DSA;
import java.util.*;
public class VarArgs {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      fun(1,2,3,4,5,6,7,7,8,8,8,8,8,8,8,8,8,8);  
      multiple(5,6,"sahith","krishna","praveen");
    }
    static void multiple(int a,int b,String...v){/*->the variable args should be placed 
        at last only */
        System.out.println(a + "" + b);
        System.out.println(Arrays.toString(v));

    }
    static void fun(int...v){
        System.out.println(Arrays.toString(v));
    }
}
