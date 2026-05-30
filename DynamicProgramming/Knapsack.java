package DynamicProgramming;
public class Knapsack {

    //Using Memoization O(n*W)
    public static int knap(int val[],int wt[],int W,int n,int dp[][]){
        
        if(W == 0 || n == 0){
            return 0;
        }

        if(dp[n][W] != -1){
            return dp[n][W];
        }
        if(wt[n-1] <= W){ //valid
            //include
            int ans1 = val[n-1] + knap(val, wt, W-wt[n-1], n-1,dp);
            //exclude
            int ans2 = knap(val, wt, W, n-1,dp);
            dp[n][W] =  Math.max(ans1, ans2);
            return dp[n][W];
        }else{
            //Not Valid
            dp[n][W] = knap(val, wt, W, n-1,dp);
            return dp[n][W];
        }
        
    }
    
    //i - no. of items & j - Knapsack size
    //initaially i[0]j[0] = 0
    //Start loop from 1 to n+1
    //dp[n+1][W+1] from 0 to n+1

    public static int knaptab(int val[],int wt[],int W){
        int n = val.length;
        int dp[][] = new int[n+1][W+1];
        for(int i=0;i<dp.length;i++){  //initialising all rows in 0th Col as 0
            dp[i][0] = 0;  
        }
        for(int j=0;j<dp[0].length;j++){ //initialising all cols in 0th Row as 0
            dp[0][j] = 0;
        }

        for(int i=1;i<n+1;i++){
            for(int j=1;j<W+1;j++){
                int v = val[i-1];  //val of ith item
                int w = wt[i-1];   //weight of ith item
                if(w <= j){        //valid condition
                    //include
                    int incprof = v + dp[i-1][j-w];
                    //exclude
                    int excprof = dp[i-1][j];
                    dp[i][j] = Math.max(incprof,excprof);
                  
                }else{
                    //invalid condition
                    int excprof = dp[i-1][j];
                    dp[i][j] = excprof;
                   
                }
            }
        }
        return dp[n][W];
    }
    public static void main(String[] args) {
    int val[] = {15,14,10,45,30};
    int wt[] = {2,5,1,3,4};
    int W = 7;
    int dp[][] = new int[val.length+1][W+1];
    for(int i=0;i<dp.length;i++){
        for(int j=0;j<dp[0].length;j++){
            dp[i][j] = -1;
        }
    }
    System.out.println(knap(val, wt, W,val.length,dp));
    System.out.println(knaptab(val, wt, W));
    }
}
