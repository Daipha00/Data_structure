//Given an array of integers, return indices of the two numbers such 
// that they add up to a specific target.
//You may assume that each input would have exactly one solution, 
// and you may not use the same element twice.
//You can return the answer in any order.

import java.util.HashMap;
import java.util.Map;

class TwoSum{
    public static void main(String[] args){
        int[] nums = {15,7,2,11};
        int target = 9;

        TwoSum twoSum = new TwoSum();
        int[] result = twoSum.twoSum(nums, target);

        System.out.println(result[1] + " " + result[0]);
    }
    public int[] twoSum(int[] nums, int target){
        //create a hashmap to store numbers and their indices
        Map<Integer, Integer> map = new HashMap<>();

        //iterating through the array
        for(int i = 0; i < nums.length; i++){
            int num = nums[i];

           //Calculate compliment of the current number
            int complement = target - num;

            //Check if the compliment is already present in the hashmap
            if(map.containsKey(complement)){
                return new int[]{map.get(complement), i};

            }
            else{
                //Otherwise add the current number and its index to the hashmap
                map.put(num, i);
            }
        }
        //Return an empty array if no solution is found
        return new int[]{};
    }
}
