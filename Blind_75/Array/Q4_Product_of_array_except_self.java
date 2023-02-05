package Blind_75.Array;

public class Q4_Product_of_array_except_self {

    class Solution {

        /**
         * Time Complexity - O(n);
         * Space Complexity - O(n) + O(n) + O(n);
         */
        private int[] getProductExceptSelf(int[] nums) {
            if (nums == null) return new int[0];

            int size = nums.length;
            int[] prefix = new int[size];
            prefix[0] = nums[0];
            for (int i = 1; i < size; i++) {
                prefix[i] = prefix[i - 1] * nums[i];
            }

            int[] suffix = new int[size];
            suffix[size - 1] = nums[size - 1];
            for (int i = size - 2; i >= 0; i--) {
                suffix[i] = suffix[i + 1] * nums[i];
            }


            int[] result = new int[size];
            for (int i = 0; i < size; i++) {
                if (i == 0) {
                    result[i] = suffix[i + 1];
                } else if (i == size - 1) {
                    result[i] = prefix[i - 1];
                } else {
                    result[i] = suffix[i + 1] * prefix[i - 1];
                }
            }
            return result;
        }

        public int[] productExceptSelf(int[] nums) {
            return getProductExceptSelf(nums);
        }
    }
}
