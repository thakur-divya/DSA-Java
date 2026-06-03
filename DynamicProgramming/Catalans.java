package DynamicProgramming;
import java.util.*;
public class Catalans {               

    public static int Cat(int n){   //Using Recursion
        if(n==0 || n==1){
            return 1;
        }
        int ans = 0;
        for(int i=0;i<n;i++){
            ans += Cat(i) * Cat(n-i-1);
        }
        return ans;
    }

    public static int CatMemo(int n,int dp[]){      //Using Memoization
        //base case
        if(n==0 || n==1){
            return 1;
        }
        if(dp[n] != -1){
            return dp[n];
        }
        int ans = 0;
        for(int i=0;i<=n-1;i++){
            ans += CatMemo(i, dp) * CatMemo(n-i-1, dp);
        }
        return ans;
    }

    public static int Cattab(int n){ //Using Tabulation O(n*n)
        int dp[] = new int[n+1];

        dp[0] = 1;
        dp[1] = 1;

        for(int i=2;i<=n;i++){
            for(int j=0;j<=i-1;j++){
                dp[i] += dp[j] * dp[i-j-1];
            }
        }
        
        return dp[n];
    }

    public static int countbsts(int n){   //Count BSTs
         int dp[] = new int[n+1];

        dp[0] = 1;
        dp[1] = 1;

        for(int i=2;i<=n;i++){
            for(int j=0;j<=i-1;j++){
                dp[i] += dp[j] * dp[i-j-1];
            }
        }
        
        return dp[n];
    }
    public static void main(String[] args) {
        int n = 5;
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(Cat(n));
        System.out.println(CatMemo(4, dp));
        System.out.println(Cattab(3));
    }
}
