package dsa.sliding_window;

import java.util.HashMap;
import java.util.Map;

public class Prb1_ContainsDuplicate {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        int start = 0;
        for(int end = 0;end<nums.length;end++){
            map.put(nums[end],
                    map.getOrDefault(nums[end],0)+1);
            if(map.get(nums[end])>1)
                return true;
            if(end-start==k){
                map.put(nums[start],map.getOrDefault(nums[start],0)-1);
                start++;
            }
        }
        return false;
    }

    public static void main(String[] args){
        System.out.println(containsNearbyDuplicate( new int[]{1,2,3,4,5,6,4},3));
    }
}
