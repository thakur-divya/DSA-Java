package stack;
/*Given a circular integer array nums
 (i.e., the next element of nums[nums.length - 1] is nums[0]), 
 return the next greater number for every element in nums. */

 //Input: nums = [1,2,1] Output: [2,-1,2]

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class NextGreaterII {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> s = new Stack<>();
        int n = nums.length;
        int result[] = new int[n];
        for(int i=2*n-1;i>=0;i--){
            while(!s.isEmpty() && s.peek() <= nums[i%n]){
                s.pop();
            }
            if(i<n){
            if(s.isEmpty()){
                result[i] = -1;
            }else{
                result[i] = s.peek();
            }
            }
            s.push(nums[i%n]);
        }
        return result;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array nums ");
        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        NextGreaterII ob = new NextGreaterII();
        System.out.println(Arrays.toString(ob.nextGreaterElements(nums)));
    }
}
