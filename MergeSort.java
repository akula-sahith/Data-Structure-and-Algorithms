package DSA;
import java.util.*;
public class MergeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {5,4,3,2,1};
        System.out.println("Before sorted");
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        
        int[] ans = mergesort(arr);
        System.out.println("After Sorted");
        System.out.println(Arrays.toString(ans));
}
static int[] mergesort(int[] arr){
    if(arr.length==1){
        return arr;       
    }
     int mid = arr.length/2;
     int[] left = mergesort(Arrays.copyOfRange(arr, 0, mid));
     int[] right = mergesort(Arrays.copyOfRange(arr, mid, arr.length));
 
    return merge(left,right);
}
static int[] merge(int[] first,int[] second){
    int i = 0;
    int j = 0;
    int[] mix = new int[first.length + second.length];
    int k = 0;

    while(i<first.length&&j<second.length){
        if(first[i]<second[j]){
            mix[k] = first[i];
            i++;
        }
        else{
            mix[k] = second[j];
            j++;
        }
        k++;
    }
    while(i<first.length){
        mix[k] = first[i];
        i++;
        k++;
    }
    while(j<second.length){
        mix[k] = second[j];
        j++;

        k++;
    }
    return mix;
}
}