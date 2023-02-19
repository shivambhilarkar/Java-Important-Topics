package Blind_75.String;

public class Q6_Count_palindromic_substrings {

    class Solution {

        private int countPalindromicSubstrings(String str){
            if(str == null) return 0;

            boolean[][] dp = new boolean[str.length()][str.length()];

            for(int i = 0,j=0; i < dp.length; i++ , j++){
                dp[i][j] = true;
            }

            int count = str.length();
            for(int g = 1; g < dp[0].length; g++){
                for(int i = 0, j = g; j < dp[0].length; j++, i++ ){

                    if(g == 1 && str.charAt(i) == str.charAt(j)){
                        dp[i][j] = true;
                    }else if(str.charAt(i) == str.charAt(j) && dp[i+1][j-1]){
                        dp[i][j] = true;
                    }else{
                        dp[i][j] = false;
                    }

                    if(dp[i][j]) count += 1;

                }
            }
            return count;
        }

        public int countSubstrings(String s) {
            return countPalindromicSubstrings(s);
        }
    }
}
