package Blind_75.Array;

public class Q5_Maximum_sum_subarray {

    class Solution {

        /**
         * Brute Force Solution
         * Time Complexity - (On)^2;
         * Space Complexity - O(1);
         */
        private int getMaxSubArraySum(int[] nums) {
            if (nums == null) return 0;
            int maxSum = Integer.MIN_VALUE;
            for (int i = 0; i < nums.length; i++) {
                int sum = 0;
                for (int j = i; j < nums.length; j++) {
                    sum += nums[j];
                    maxSum = Math.max(sum, maxSum);
                }
            }
            return maxSum;
        }


        /**
         * Optimal Solution -> Kadan's Algorithm
         * Time Complexity -> O(n);
         * Space Complexity -> O(1);
         */
        private int getMaxSubArraySum2(int[] nums) {
            if (nums == null) return 0;

            int maxSum = nums[0];
            for (int i = 1; i < nums.length; i++) {
                if (nums[i - 1] > 0) {
                    nums[i] += nums[i - 1];
                }
                maxSum = Math.max(maxSum, nums[i]);
            }
            return maxSum;
        }

        public int maxSubArray(int[] nums) {
            return getMaxSubArraySum2(nums);
        }
    }
}
