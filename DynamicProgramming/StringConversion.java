package DynamicProgramming;

//Only inserion and deletion is allowed
//Show how many are done
//First convert it into lcs and get the difference of str2-lcs.length() for inserting
//diff of str1.lenght - lcs.length would give deletion 
public class StringConversion {
    public static int lcs(String str1,String str2){  //Using LCS
        int n = str1.length();
        int m = str2.length();
        int dp[][] = new int[n+1][m+1];

        for(int i=0;i<n+1;i++){
            dp[i][0] = 0;
        }
        for(int j=0;j<m+1;j++){
            dp[0][j] = 0;
        }
        
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(str1.charAt(i-1) == str2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] + 1;
                }else{
                    int ans1 = dp[i-1][j];
                    int ans2 = dp[i][j-1];
                    dp[i][j] = Math.max(ans1,ans2);
                }
            }
        }
        return dp[n][m];
    }
    public static void conver(String str1,String str2){
        int insertion = str2.length() - lcs(str1, str2);
        int deletion = str1.length() - lcs(str1, str2);
        System.out.println(insertion + " no. of insertions & " + deletion + " no. of deletion");
        }
    
    public static void main(String[] args) {
        String str1 = "pear";
        String str2 = "sea";
        conver(str1, str2);
    }
}
