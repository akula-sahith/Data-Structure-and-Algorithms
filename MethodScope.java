package DSA;

public class MethodScope {
    public static void main(String[] args) {
        int c = 5;
        int d = 6;
        swap(c,d);
        System.out.println(a);/*->this shows an error because the variables
        initialized in other function can use in different
         function only this is called
        method scope */
    }
    static void swap(int a,int b){
     int temp = a;
     a = b;
     b = temp;/*->this change will not affect the original one as in 
     java it is pass by value */
    }
}
