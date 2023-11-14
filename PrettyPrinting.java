package DSA;
import java.util.*;
public class PrettyPrinting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float a = 4526.454615646f;
        System.out.printf("Formatted number is %.5f",a);
        System.out.println();
        /* %f - float type
           %s - string type
           %d - integer type etc         
        */
        /*we have a comstant value in java for pi */
        System.out.println(Math.PI);
        System.out.printf("AFter Formating %.2f",Math.PI);
        System.out.println();
        System.out.printf("My name is %s and i am %s","sahith","cool");
        System.out.printf("number1 : %d"+"number2 : %d",5,6);
    }
    
}
