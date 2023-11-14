//why use insertion sort algorithm?
//steps get reduced if the array is sorted
//it is good for partially sorted arrays
//used for smaller values of n

package DSA;
import java.util.*;
public class InsertionSorting {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 int[] arr = {3,4,5,1,2};
 insertion(arr);
 System.out.println(Arrays.toString(arr));
 }
 static void insertion(int[] arr){
 for (int i = 0; i <= arr.length-2; i++) {
 for (int j = i+1; j > 0; j--) {
 if(arr[j]<arr[j-1]){
 swap(arr,j,j-1);            
 }
 else if(arr[j]>arr[j-1]){
 break;               
 }
 }
 } 
 }
 static void swap(int[] arr,int start,int last){
 int temp = arr[start];
 arr[start] = arr[last];
 arr[last] = temp;
}
}
