package DSA;
import java.util.*;
public class QuickSort {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] arr1 = {5,4,3,2,1};
    System.out.println(Arrays.toString(arr1));
    sort(arr1,0,arr1.length-1);
    System.out.println(Arrays.toString(arr1));
 }   
 static void sort(int[] arr,int low,int high){
    if(low>=high){
        return;
    }
    int s = low;
    int e = high;
    int mid = s + (e-s)/2;
    int pivot = arr[mid];
    while(s<=e){
        while(arr[s]<pivot){
            s++;
        }
        while(arr[e]>pivot){
            e--;
        }
        if(s<=e){
            int temp  = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    } 
    sort(arr,low,e);
    sort(arr,s,high);

 }
}
