package DynamicProgramming;

public class HouseRobber{
    //Input - {1,4,2,1} O/p - 5 (4+1)
    public static int theif(int nums[]){
        int n = nums.length;
        int[] dp = new int[n];

        //Base Cases
        if(n == 1){
            return nums[0];
        }
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0],nums[1]);
        for(int i=2;i<n;i++){
            dp[i] = Math.max(dp[i-1],dp[i-2]+nums[i]);
        }
        return dp[n-1];
    }
    public static void main(String[] args) {
        int nums[] = {1,4,2,1};
        System.out.println(theif(nums));
    }
}