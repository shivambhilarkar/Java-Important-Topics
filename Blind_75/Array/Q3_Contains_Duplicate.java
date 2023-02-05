package Blind_75.Array;

import java.util.HashSet;

public class Q3_Contains_Duplicate {

    class Solution {

        /**
         * Time Complexity - O(n)
         * Space Complexity - O(n)
         */
        private boolean checkDuplicate(int[] nums) {
            if (nums == null) return false;

            HashSet<Integer> set = new HashSet<>();
            for (int num : nums) {
                if (set.contains(num)) {
                    return true;
                }
                set.add(num);
            }
            return false;
        }

        public boolean containsDuplicate(int[] nums) {
            return checkDuplicate(nums);
        }
    }


}
