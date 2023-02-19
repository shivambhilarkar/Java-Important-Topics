package Blind_75.String;

public class Q7_Longest_Palindromic_substrings {
    class Solution {

        private String longestPalindromicSubstring(String str) {
            if (str == null) return "";

            boolean[][] dp = new boolean[str.length()][str.length()];
            for (int i = 0, j = 0; i < dp.length; i++, j++) {
                dp[i][j] = true;
            }
            String result = str.charAt(0) + "";
            for (int g = 1; g < dp[0].length; g++) {
                for (int i = 0, j = g; j < dp[0].length; j++, i++) {

                    if (g == 1 && str.charAt(i) == str.charAt(j)) {
                        dp[i][j] = true;
                    } else if (str.charAt(i) == str.charAt(j) && dp[i + 1][j - 1]) {
                        dp[i][j] = true;
                    } else {
                        dp[i][j] = false;
                    }

                    if (dp[i][j]) {
                        result = str.substring(i, j + 1);
                    }
                }
            }
            return result;
        }


        public String longestPalindrome(String s) {
            return longestPalindromicSubstring(s);
        }
    }

}
