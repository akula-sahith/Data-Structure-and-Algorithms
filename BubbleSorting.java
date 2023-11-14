package DSA;
import java.util.*;
import java.util.Arrays;;
public class BubbleSorting {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("before sorting");
        System.out.println(Arrays.toString(arr));
        bubble(arr);
        System.out.println("after sorting");
        System.out.println(Arrays.toString(arr));
     }
     static void bubble(int[] arr){
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for( int j = 1;j<arr.length-i;j++){
            if(arr[j]<arr[j-1]){
                //swap
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                swapped = true;
            }
            }
            if(swapped==false){
             break;
            }
        }
     }
}
