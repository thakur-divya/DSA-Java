package Leet;
import java.util.*;
public class Prob1 {
    public int[] twoSum(int[] nums,int target){
        int arr[] = new int[2];
        for(int i=0;i<nums.length;i++){
            int digit = nums[i];
            for(int j=i+1;j<nums.length;j++){
                if(digit + nums[j] == target){
                    arr[0] = i;
                    arr[1] = j;
                    return arr;
                }
            }
        }
        return new int[]{-1,-1}; //trick learn this
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array : ");
        int n = sc.nextInt();
        int nums[] = new int[n];
        System.out.println("Enter the array elements : ");
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter the target element : ");
        int target = sc.nextInt();
        Prob1 ob = new Prob1();
        System.out.println(Arrays.toString(ob.twoSum(nums, target))); //here learn it
    }
}
