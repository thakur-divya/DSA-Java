package DynamicProgramming;

public class EditDistance {
    public static int editdist(String str1,String str2){
        int n = str1.length();
        int m = str2.length();
        int dp[][] = new int[n+1][m+1];

        for(int i=0;i<n+1;i++){
            for(int j=0;j<m+1;j++){
                if(i==0){             //0th Row
                    dp[i][j] = j; 
                }
                if(j==0){             //0th Column
                    dp[i][j] = i;
                }
            }
        }

        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(str1.charAt(i-1) == str2.charAt(j-1)){   //same
                    dp[i][j] = dp[i-1][j-1];
                }else{                                      //diff
                    int add = dp[i][j-1] + 1;
                    int del = dp[i-1][j] + 1;
                    int rep = dp[i-1][j-1] + 1;
                    dp[i][j] = Math.min(Math.min(add,del),rep);
                }
            }
        }
        return dp[n][m];
    }
    public static void main(String[] args) {
        String word1 = "intention";
        String word2 = "execution";
        System.out.println(editdist(word1, word2));
    }
}
