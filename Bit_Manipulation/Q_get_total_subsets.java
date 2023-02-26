package Bit_Manipulation;

import java.util.ArrayList;
import java.util.List;

public class Q_get_total_subsets {


    private List<List<Integer>> getSubsets(int[] nums) {
        if (nums == null) return new ArrayList<>();

        int n = nums.length;
        int subsets_count = (1 << n); //subset count 2 ^ n

        List<List<Integer>> result = new ArrayList<>();
        for (int mask = 0; mask < subsets_count; mask++) {
            List<Integer> subset = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) {
                    subset.add(nums[i]); //add current element in current set;
                }
            }
            result.add(subset);
        }
        return result;

    }

    public List<List<Integer>> subsets(int[] nums) {
        return getSubsets(nums);
    }
}
