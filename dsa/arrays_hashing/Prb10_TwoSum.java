package dsa.arrays_hashing;

import java.util.HashMap;

public class Prb10_TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hashmap  = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int balance = target - nums[i];
            if(hashmap.get(balance)!=null){
                return new int[]{hashmap.get(balance), i};
            }
            hashmap.put(nums[i], i);
        }

        return new int[]{-1,-1};

    }
}
