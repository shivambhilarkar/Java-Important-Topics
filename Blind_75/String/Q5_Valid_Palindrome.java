package Blind_75.String;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Q5_Valid_Palindrome {

    class Solution {

        private boolean checkPalindrome(String str) {
            if (str == null) return true;

            String[] array = str.split("");

            StringBuilder sb = new StringBuilder();
            for (String ch : array) {
                if (Character.isLetter(ch.charAt(0)) || Character.isDigit(ch.charAt(0))) {
                    sb.append(ch);
                }
            }
            String s = sb.toString().toLowerCase();

            int start = 0;
            int end = s.length() - 1;
            while (start <= end) {
                if (s.charAt(start++) != s.charAt(end--)) return false;
            }
            return true;

        }


        private boolean checkPalindrome1(String str) {
            if (str == null) return true;

            String[] array = str.split("");

            String result = Arrays.stream(array)
                    .filter(s -> (Character.isLetter(s.charAt(0)) || Character.isDigit(s.charAt(0))))
                    .map(String::valueOf)
                    .collect(Collectors.joining()).toLowerCase();


            int start = 0;
            int end = result.length() - 1;
            while (start <= end) {
                if (result.charAt(start++) != result.charAt(end--)) return false;
            }
            return true;
        }


        public boolean isPalindrome(String s) {
            return checkPalindrome(s);
        }
    }

}
