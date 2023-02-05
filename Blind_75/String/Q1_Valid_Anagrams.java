package Blind_75.String;

import java.util.HashMap;

public class Q1_Valid_Anagrams {

    class Solution {
        private boolean isValidAnagrams(String s, String t) {
            if (s == null && t == null) return true;
            if (s.length() != t.length()) return false;

            HashMap<Character, Integer> map = new HashMap<>();
            for (char ch : s.toCharArray()) {
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }

            for (char ch : t.toCharArray()) {
                if (map.containsKey(ch)) {
                    if (map.get(ch) == 1) {
                        map.remove(ch);
                    } else {
                        map.put(ch, map.get(ch) - 1);
                    }
                }
                return false;
            }

            return map.size() == 0;
        }

        public boolean isAnagram(String s, String t) {
            return isValidAnagrams(s, t);
        }
    }

}
