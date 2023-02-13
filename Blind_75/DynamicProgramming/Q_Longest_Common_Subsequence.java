package Blind_75.DynamicProgramming;

public class Q_Longest_Common_Subsequence {
    class Solution {

        /**
         Optimal Solution
         Time Complexity -> o(n)^2
         Space Complexity -> o(n)^2 */

        private int getLongestCommonSubsequence(String str1, String str2){
            if(str1 == null || str2 == null) return 0;

            int n = str1.length();
            int m = str2.length();

            int[][] memo = new int[n+1][m+1];
            for(int i = 1; i <= n; i++){
                for(int j = 1; j <= m; j++){
                    if(str1.charAt(i-1) == str2.charAt(j-1)){
                        memo[i][j] = memo[i-1][j-1] + 1;
                    }else{
                        memo[i][j] =  Math.max(memo[i-1][j], memo[i][j-1]);
                    }
                }
            }
            return memo[n][m];
        }

        public int longestCommonSubsequence(String text1, String text2) {
            return getLongestCommonSubsequence(text1, text2);
        }
    }


}
