package dsa.arrays_hashing;

import java.util.ArrayList;
import java.util.List;
/*
Time O(N)
Space O(1)
better solution is to negate the elem at correct index
 */
public class Prb125_FindAllDuplicatesInArray {
    public List<Integer> findDuplicates(int[] nums) {
        for(int i=0;i<nums.length;i++){
            nums[i] = nums[i]<<2;
        }

        List<Integer> result = new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            int elem = nums[i]>>2;
            int index = (elem-1);

            if(((nums[index])&(1))!=0){
                //System.out.println(elem + " index" + index);
                result.add(elem);
            } else {
                nums[index] = nums[index] | 1;
            }
        }

        return result;
    }
}
