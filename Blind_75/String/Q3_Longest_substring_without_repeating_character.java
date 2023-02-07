package Blind_75.String;

import java.util.HashMap;

public class Q3_Longest_substring_without_repeating_character {
    class Solution {

        private int getMaxLengthSubstring(String str){
            if(str == null || str.length() == 0) return 0;

            HashMap<Character,Integer> map = new HashMap<>();

            int firstPointer = 0;
            int secondPointer = 0;
            int max = 0;

            while(secondPointer < str.length()){
                char currentChar = str.charAt(secondPointer);
                map.put(currentChar , map.getOrDefault(currentChar , 0 ) + 1 );

                if(map.get(currentChar) > 1){
                    while(map.get(currentChar) > 1 && firstPointer < secondPointer){
                        char frontChar = str.charAt(firstPointer);
                        if(map.get(frontChar) == 1){
                            map.remove(frontChar);
                        }else{
                            map.put(frontChar, map.get(frontChar)-1);
                        }
                        firstPointer += 1;
                    }

                }
                secondPointer += 1;
                max = Math.max(max, (secondPointer-firstPointer));
            }
            return max;
        }

        public int lengthOfLongestSubstring(String s) {
            return getMaxLengthSubstring(s);
        }
    }
}
