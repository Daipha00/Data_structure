//Given an array, nums and interger k, return true if there are two distinct indices i and j in the
//array such that nums[i] = = nums[j] and abs(i - j) <= k.

import java.util.HashSet;
import java.util.Set;

public class Duplicate2 {
    public static void main(String[] args) {

        int[] nums = {1,2,3,1,3,4,5,2};
        int k = 3;

        Duplicate2 duplicate2 = new Duplicate2();
        boolean isDuplicate = duplicate2.containsNearbyDuplicate(nums, k);
        System.out.println(isDuplicate);
    }

     public boolean containsNearbyDuplicate(int[] nums, int k) {
    Set<Integer> set = new HashSet<>();

    for (int i = 0; i < nums.length; i++) {
        if (set.contains(nums[i])) return true;

        set.add(nums[i]);

        if (set.size() > k) {
            set.remove(nums[i - k]);
        }
    }

    return false;
}

}
