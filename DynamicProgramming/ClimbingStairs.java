package DynamicProgramming;

import java.util.Arrays;

//Count ways to reach nth stair. one can climb 1 or 2 stairs at a time
public class ClimbingStairs {
    public static int countWays(int n,int ways[]){  //Using only recursion + memoization
        if(n == 0){
            return 1;
        }
        if(n < 0){
            return 0;
        }
        if(ways[n] != -1){
            return ways[n];
        }
        ways[n] = countWays(n-1,ways) + countWays(n-2,ways);
        return ways[n];
    }
    public static void main(String[] args) {
        int n = 5;
        int ways[] = new int[n+1]; // 0 0 0 0 
        Arrays.fill(ways, -1); //-1 -1 -1 -1
        System.out.println(countWays(n,ways));
    }
}
