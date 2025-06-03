package dsa.arrays_hashing;

import java.util.HashMap;
import java.util.Map;

/*
Brute Force -> Time O(N^2) Space O(1)
Sorting -> Time O(NLogN) Space O(1)
Hash -> Time O(N) Space O(N)
 */

public class Prb3_ContainsDuplicate {
    public static boolean hasDuplicate(int[] nums) {
        Map<Integer,Integer> hashmap = new HashMap<>();
        for(int elem: nums){
            if(hashmap.get(elem)!=null)
                return true;
            hashmap.put(elem, 1);
        }
        return false;
    }
    public static void main(String[] args){
        int[] nums = {1,2,3,4,5};
        System.out.println(hasDuplicate(nums));
        nums = new int[]{1,2,3,3};
        System.out.println(hasDuplicate(nums));

    }
}
