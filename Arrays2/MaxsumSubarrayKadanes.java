package Arrays2;

//Kadanes algo Time complexity is O(n) and space complexity is O(1). Problem no 53 in leetcode
public class MaxsumSubarrayKadanes {
    public static void maxsum(int number[]){
        int cursum =0;
        int maxsum = Integer.MIN_VALUE;
        
        for(int i=0;i<number.length;i++){
            cursum = cursum + number[i];
           
            if(cursum > maxsum){
                maxsum = cursum;
            }
            if(cursum < 0){
                cursum = 0;
            }
            
            
            System.out.println("CS : " + cursum + " " + "MS : " + maxsum + " ");
            
        }
        System.out.println("Maximum sum is : " + maxsum);
    }
    public static void main(String[] args) {
        int numbers[]={-2,-5,-1};
        maxsum(numbers);
    }
}
