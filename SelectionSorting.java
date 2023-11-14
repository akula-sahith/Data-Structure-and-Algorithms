package DSA;
import java.util.*;
public class SelectionSorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        selectsort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int[] selectsort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length-i-1;
            int maxindex = findmaxindex(arr,0,last);
            swap(arr,maxindex,last);
        }
        return arr;
    }
    static int findmaxindex(int[] arr,int start,int end){
        int mi = start;
        for (int i = 0; i<=end; i++) {
            if(arr[i]>arr[mi]){
                mi = i;
            }
        }
        return mi;
    }
    static void swap(int[] arr,int first,int second){
      int temp = arr[first];
      arr[first] = arr[second];
      arr[second] = temp;
    }
}
