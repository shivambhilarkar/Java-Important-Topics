package Blind_75.Array;

public class Q2_Best_Time_to_Buy_and_Sell_stocks {

    class Solution {

        /**
         * Optimal Solution
         * Space Complexity - O(1)
         * Time Complexity - O(n)
         */
        private int getMaxProfit(int[] prices) {
            if (prices == null) return 0;

            int maxProfit = 0;
            int minPrice = Integer.MAX_VALUE;
            for (int num : prices) {
                int currentProfit = num - minPrice;
                maxProfit = Math.max(currentProfit, maxProfit);
                minPrice = Math.min(minPrice, num);
            }
            return maxProfit;
        }


        public int maxProfit(int[] prices) {
            return getMaxProfit(prices);
        }
    }

}
