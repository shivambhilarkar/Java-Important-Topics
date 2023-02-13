package Blind_75.BitManipulation;

import java.util.Arrays;

public class Q1_missing_number {

    class Solution {
        private int getMissingNumber1(int[] nums) {
            if (nums == null) return 0;

            int n = nums.length;
            int requireSum = n * (n + 1) / 2;

            int current = 0;
            for (int num : nums){
                current += num;
            }

            return requireSum - current;
        }

        private int getMissingNumber2(int[] nums){
            if(nums == null) return 0;

            int n = nums.length;
            int requiredSum = n * (n + 1) / 2;

            int currentSum = Arrays.stream(nums).sum();

            return requiredSum - currentSum;
        }

        public int missingNumber(int[] nums) {
            return getMissingNumber1(nums);
        }
    }

}
