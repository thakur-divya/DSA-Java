package DynamicProgramming;

import java.util.HashSet;
/*
You are given a 0-indexed string s and a dictionary of words dictionary. 
You have to break s into one or more non-overlapping substrings such that 
each substring is present in dictionary.
 There may be some extra characters in s which are not present in any of the substrings. */
public class ExtraChar {
    //Return the minimum number of extra characters left over if you break up s optimally.
    public static int minExtraChar(String s, String[] dictionary) {
        HashSet<String> set = new HashSet<>();

        for(String word : dictionary){
            set.add(word);
        }

        int n = s.length();
        int[] dp = new int[n + 1];

        dp[n] = 0;

        for(int i = n - 1; i >= 0; i--){

            // Assume current character is extra
            dp[i] = 1 + dp[i + 1];

            for(int j = i; j < n; j++){

                String curr = s.substring(i, j + 1);

                if(set.contains(curr)){
                    dp[i] = Math.min(dp[i], dp[j + 1]);
                }
            }
        }

        return dp[0];
    }
    public static void main(String args[]){
        String s = "leetscode";
        String dictionary[] = {"leet","code","leetcode"};
        System.out.println(minExtraChar(s,dictionary));
    }
}
