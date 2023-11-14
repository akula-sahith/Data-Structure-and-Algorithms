/*This is very very important algorithm */
/*Use this algorithm when you have to search in range 1 to n */
/*the element index is equal to value of element if the range is from 0 to n */
/*the element index is equal to value of element-1 if the range from 1 to n*/
package DSA;
import java.util.*;
public class CyclicSorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {3,5,4,1,2};
        Cyclic(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void Cyclic(int[] arr){
        int i = 0;
   while(i<arr.length){
    int correct = arr[i] - 1;
    if(i!=correct){
        swap(arr,i,correct);
    }
    else{
        i++;
    }
   }
    }
    static void swap(int[]  arr,int first,int last){
      int temp = arr[first];
      arr[first] = arr[last];
      arr[last] = temp;
    }
}
