package stack;
import java.util.*;
//132 Pattern leetcode 456
/*Given an array of n integers nums, a 132 pattern is a
 subsequence of three integers nums[i],
 nums[j] and nums[k] such that i < j < k and nums[i] < nums[k] < nums[j] */
public class OneThreeTwo {
    public static boolean pattern(int nums[]){
        Stack<Integer> s = new Stack<>();
        int second = Integer.MIN_VALUE;

        for(int i=nums.length-1;i>=0;i--){
            if(nums[i] < second){
                return true;
            }
            while(!s.isEmpty() && nums[i] > s.peek()){
                second = s.pop();
            }
            s.push(nums[i]);
        }
        return false;
    }
    public static void main(String[] args) {
        int nums[] = {3,1,4,2};
        System.out.println(pattern(nums));
    }
}
