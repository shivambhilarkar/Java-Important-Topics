package Blind_75.Array;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class Q7_Search_in_rotated_sorted_array {


        /**
         * Brute Force Solution
         * Time Complexity -> O(n)
         * Space Complexity -> O(1)
         */
        public int getIndex(int[] nums, int target) {
            if (nums == null) return -1;
            for (int index = 0; index < nums.length; index++) {
                if (nums[index] == target) return index;
            }
            return -1;
        }


        public static int getIndex2(int[] nums, int target) {
            AtomicInteger index = new AtomicInteger();

             return Arrays.stream(nums)
                     .peek((num) -> index.incrementAndGet())
                     .filter(num -> num == target)
                     .findFirst()
                     .orElse(-1) == -1 ? -1 : index.get()-1;
        }




        /*
        TODO : Binary Search Approach is Remaining
         */


        public static int search(int[] nums, int target) {

            return getIndex2(nums, target);
        }

        public static void main(String[] args) {
            int[] nums = {1,2,3,4,5,6,7,8};
            int target = 5;
            System.out.println(search(nums, target));
        }


}
