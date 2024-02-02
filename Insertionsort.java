package DSA;
import java.util.*;
public class Insertionsort{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter array elements : ");
        for(int i = 0;i<nums.length;i++){
            nums[i] = sc.nextInt();
        }
        System.out.println("Before sorting : ");
        for(int i = 0;i<nums.length;i++){
           System.out.println(nums[i]+" ");
        }
        insertionsort(nums);
        System.out.println("After sorting : ");
        for(int i = 0;i<nums.length;i++){
           System.out.println(nums[i]+" ");
        }
    }
    static void insertionsort(int[] nums){
     //int key = nums[nums.length-1];
     for(int i = nums.length-1;i>0;i--){
        int key = nums[i];
        int j = i-1;
        while(j>0&&nums[j]>key){
           nums[j+1] = nums[j];
           nums[j] = key;
           j = j - 1;
        }
     }
    }
}