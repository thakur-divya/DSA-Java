package stack;
import java.util.*;
//You are given two distinct 0-indexed integer arrays nums1 and nums2, where nums1 is a subset of nums2.
Return an array ans of length nums1.length such that ans[i] is the next greater element as described above.
public class NextGreater {
    public int[] nextGreaterElement(int[] nums1, int[] nums2){
        int result[] = new int[nums1.length];
        Stack<Integer> s = new Stack<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i=nums2.length-1; i>=0 ;i--){
            while(!s.isEmpty() && s.peek() <= nums2[i]){
                s.pop();
            }
            if(s.isEmpty()){
                map.put(nums2[i], -1);
            }
            else{
                map.put(nums2[i],s.peek());
            }
            s.push(nums2[i]);
        }
        for(int i = 0; i < nums1.length; i++){
            result[i] = map.get(nums1[i]);
        }

        return result;
    }
    public static void main(String[] args) {
        int nums1[] = {2,4};
        int nums2[] = {1,2,3,4};
        
        NextGreater ob = new NextGreater();
        System.out.println(Arrays.toString(ob.nextGreaterElement(nums1, nums2)));
    }
}
