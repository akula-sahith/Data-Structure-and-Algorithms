package DSA;
import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayListing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(5); // Create an ArrayList
       
        // You can now use the 'list' object to store and manipulate integers
        list.add(1);
        list.add(2);
        list.add(3);
       
        // Print the elements in the list
        for (Integer num : list) {
            System.out.println(num);
        }
        Collections.reverse(list);
    }
}
