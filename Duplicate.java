//Given an array of integers, return true if any value appears at least twice in the 
// array, and return false if every element is distinct.

import java.util.HashSet;

public class Duplicate {
    public static void main(String[] args) {
        int[] nums = {1,4,3,5,7};

        Duplicate duplicate = new Duplicate();
        boolean isDuplicate = duplicate.containesDuplicate(nums);

        System.out.println(isDuplicate);
    }

    public boolean containesDuplicate(int[] nums){
    HashSet<Integer> presentNumbers = new HashSet<>();

    
    for (int num: nums){
        if (presentNumbers.contains(num)){
            return true;
        }
        presentNumbers.add(num);
    }

    return false;
    }


}
