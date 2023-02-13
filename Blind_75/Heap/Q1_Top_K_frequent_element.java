package Blind_75.Heap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Q1_Top_K_frequent_element {

    class Solution {

        private int[] getTopKFrequent(int[] nums, int k){
            if(nums == null) return new int[]{};

            HashMap<Integer,Integer> map = new HashMap<>();
            for(int num : nums){
                map.put(num, map.getOrDefault(num, 0) + 1);
            }

            PriorityQueue<Map.Entry<Integer,Integer>> queue = new PriorityQueue<>((a,b)->{
                return b.getValue() - a.getValue();
            });
            for(Map.Entry<Integer,Integer> entry : map.entrySet()){
                queue.add(entry);
            }

            int[] result = new int[k];
            for(int i = 0; i < result.length; i++){
                result[i] = queue.poll().getKey();
            }
            return result;
        }





        public int[] topKFrequent(int[] nums, int k) {
            return getTopKFrequent(nums, k);
        }
    }


}
