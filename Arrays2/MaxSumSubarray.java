package Arrays2;
import java.util.*;
public class MaxSumSubarray {
    public static void maxsum(int numbers[]){
        int cursum;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0;i<numbers.length;i++){
            
            for(int j=i;j<numbers.length;j++){
                cursum=0;
                for(int k=i;k<=j;k++){
                    System.out.print(numbers[k] + "  ");
                    cursum = cursum + numbers[k];
                    

                }System.out.print("Current sum is : "+ cursum);
                
                if(cursum > maxSum){
                    maxSum = cursum;
                }
                System.out.println("");
            }
            System.out.println("");
        }
        System.out.println("Maximum sum is : " + maxSum);
    }
    public static void main(String[] args) {
        int numbers[]={1,-2,4,-3,6,10,-1};
        maxsum(numbers);
    }
}
