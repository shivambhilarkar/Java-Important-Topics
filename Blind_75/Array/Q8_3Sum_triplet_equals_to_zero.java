package Blind_75.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Q8_3Sum_triplet_equals_to_zero {

    class Solution {
        private List<List<Integer>> getTriplets(int[] nums) {
            if (nums == null) return new ArrayList<>();

            HashSet<List<Integer>> set = new HashSet<>();

            Arrays.sort(nums);
            for (int i = 0; i < nums.length - 2; i++) {
                int start = i + 1;
                int end = nums.length - 1;
                while (start < end) {
                    int sum = nums[i] + nums[start] + nums[end];
                    if (sum == 0) {
                        List<Integer> triplet = Arrays.asList(nums[i], nums[start], nums[end]);
                        set.add(triplet);
                        start += 1;
                        end -= 1;
                    } else if (sum < 0) {
                        start += 1;
                    } else {
                        end -= 1;
                    }
                }
            }
            List<List<Integer>> result = new ArrayList<>();
            for (List<Integer> lst : set) result.add(lst);
            return result;
        }

        public List<List<Integer>> threeSum(int[] nums) {
            return getTriplets(nums);
        }
    }
}
