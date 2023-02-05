package Blind_75.String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Q2_Group_Anagrams {


    class Solution {

        private List<List<String>> groupsAnagrams(String[] input) {
            if (input == null) return new ArrayList<>();

            HashMap<String, List<String>> map = new HashMap<>();

            for (String str : input) {
                char[] str_Array = str.toCharArray();
                Arrays.sort(str_Array);
                String newString = new String(str_Array);
                map.putIfAbsent(newString, new ArrayList<>());
                map.get(newString).add(str);
            }

            List<List<String>> result = new ArrayList<>();
            for (List<String> lst : map.values()) {
                result.add(lst);
            }

            return result;
        }


        private List<List<String>> groupAnagrams2(String[] input) {
            if (input == null) return new ArrayList<>();

            HashMap<String, List<String>> anagramMap = new HashMap<>();

            Arrays.stream(input).forEach((str) -> anagramHelper(str, anagramMap));

            List<List<String>> result = anagramMap.values()
                                        .stream().collect(Collectors.toList());
            return result;
        }

        private void anagramHelper(String str, HashMap<String, List<String>> anagramMap) {
            char[] str_Array = str.toCharArray();
            Arrays.sort(str_Array);
            String newString = new String(str_Array);
            anagramMap.putIfAbsent(newString, new ArrayList<>());
            anagramMap.get(newString).add(str);
        }

        public List<List<String>> groupAnagrams(String[] strs) {
            return groupsAnagrams(strs);
        }
    }


}
