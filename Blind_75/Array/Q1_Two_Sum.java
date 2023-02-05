package Blind_75.Array;

import java.util.HashMap;

public class Q1_Two_Sum {

    class Solution {
        /**
         * Brute Force Solution
         * Time Complexity - O(n)^2;
         * Space Complexity - O(1);
         */
        private int[] getPair(int[] nums, int target) {
            int[] result = new int[2];

            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums.length; j++) {
                    if (i != j && nums[i] + nums[j] == target) {
                        result[0] = i;
                        result[1] = j;
                        break;
                    }
                }
            }
            return result;
        }


        /**
         * Optimal Solution
         * Time Complexity - O(n);
         * Space Complexity - O(n);
         */
        private int[] getPair2(int[] nums, int target) {
            if (nums == null) return new int[0];

            HashMap<Integer, Integer> map = new HashMap<>();
            for (int index = 0; index < nums.length; index++) {
                int current = nums[index];
                if (map.containsKey(target - current)) {
                    return new int[]{index, map.get(target - current)};
                }
                map.put(current, index);
            }
            return new int[0];
        }


        public int[] twoSum(int[] nums, int target) {
            return getPair2(nums, target);
        }
    }


}
