package stack;
import java.util.*;

//Its Hard Level Ques(88)  asked in Many top companies

//Find the max. Area or Rectangle in Histogram. Optimized solution takes O(n) time

public class MaxAreainHistogram {
    public static void maximumarea(int[] arr){
        int maxArea = 0;
        int nsr[] = new int[arr.length];
        int nsl[] = new int[arr.length];

        //Step 1 is to calculate next smaller right
        Stack<Integer> s = new Stack<>();

        for(int i=arr.length-1; i>=0; i--){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i] = arr.length; //end j would be length of array which is diff from next greater element question
            }
            else{
                nsr[i] = s.peek();
            }
            s.push(i); //the indices would get pushed into stack to compare (j-i-1)
        }
        //Step 2 is to calculate next smaller left
        s = new Stack<>();
        for(int i=0; i<arr.length; i++){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i] = -1;
            }
            else{
                nsl[i] = s.peek();
            }
            s.push(i);
        }
        //Step 3 is to find maxArea by comparing with currArea
        for(int i=0; i<arr.length; i++){
            int height = arr[i];
            int width = nsr[i] - nsl[i] -1; //j-i-1
            int currArea = height * width;
            maxArea = Math.max(maxArea,currArea);
        }

        System.out.println("Maximum Area in Histogram is = " + maxArea);
    }
    public static void main(String[] args) {
        int arr[] = {2,1,5,6,2,3};
        maximumarea(arr);
    }
}
