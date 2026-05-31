package DynamicProgramming;

//Time Complexity is O(N*Sum)
public class TargetSum {
    public static void print(boolean dp[][]){
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static boolean target(int numbers[],int sum){
        int n = numbers.length;
        boolean dp[][] = new boolean[n+1][sum+1];
        //i = items && j =  target sum
        for(int i=0;i<dp.length;i++){    
            dp[i][0] = true;
        }

        for(int i=1;i<n+1;i++){
            for(int j=1;j<sum+1;j++){
                int v = numbers[i-1];
                //include
                if(v <= j && dp[i-1][j-v] == true){
                    dp[i][j] = true;
                }
                //exclude
                else if(dp[i-1][j] == true){
                    dp[i][j] = true;
                }   
            }
        }
        print(dp);
        return dp[n][sum];
    }
    public static void main(String[] args) {
        int numbers[] = {4,2,7,1,3};
        int sum = 10;
        System.out.println(target(numbers,sum));
    }
}
