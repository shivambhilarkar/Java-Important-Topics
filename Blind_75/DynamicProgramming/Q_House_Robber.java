package Blind_75.DynamicProgramming;

public class Q_House_Robber {

    class Solution {

        private int getMaxMoney(int[] nums) {
            if (nums == null) return 0;

            int houses = nums.length;
            int[] included = new int[houses];
            int[] excluded = new int[houses];

            included[0] = nums[0];
            excluded[0] = 0;

            for (int i = 1; i < houses; i++) {
                included[i] = excluded[i - 1] + nums[i];
                excluded[i] = Math.max(included[i - 1], excluded[i - 1]);
            }
            return Math.max(included[houses - 1], excluded[houses - 1]);

        }

        public int rob(int[] nums) {
            return getMaxMoney(nums);
        }
    }
}
