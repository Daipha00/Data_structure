//Given an ineger arraynums and an integer k, return most frequent elements.
//You may return the answer in any order

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class MostFrequentInteger {

    public static int[] mostFrequent(int[] nums, int k) {

        if (k == nums.length) {
            return nums;
        }

        Map<Integer, Integer> count = new HashMap<>();
        for (int n: nums){
            count.put(n, count.getOrDefault(n, 0)+ 1);
        }

        Queue<Integer> heap = new PriorityQueue<>(
            (a,b) -> count.get(b) - count.get(a)
        );

        for (int n: count.keySet()){
            heap.add(n);
            if(heap.size() > k ){
                heap.poll();
            }
    }
    
        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = heap.poll();
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        int k = 2;
        int[] ans = mostFrequent(nums, k);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
}

