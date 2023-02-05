package Blind_75.Array;

import java.util.Arrays;

public class Q7_Get_Minimum_from_sorted_roated_array {
    class Solution {

        /**
         Brute Force Solution
         Time Complexity -> O(n)
         */
        private int getMin(int[] nums){
            int min = Integer.MAX_VALUE;
            for(int num : nums) min = Math.min(min, num);
            return min;
        }

        /**
         Java Stream API
         */
        private int getMin2(int[] nums){
            return Arrays.stream(nums).min().getAsInt();
        }

        
        /**
         Binary Search Algoritm
         Time Complexity - O(log n);
         Space Complexity - O(1)
         */
        private int getMin3(int[] nums){
            if(nums == null) return 0;

            int left = 0;
            int right = nums.length - 1;
            while(left < right){
                int mid = left + ( (right - left) / 2 );

                if(nums[mid] < nums[right]){
                    right = mid;
                }else{
                    left = mid + 1;
                }
            }
            return nums[left];
        }



        public int findMin(int[] nums) {
            return getMin3(nums);
        }
    }
}
