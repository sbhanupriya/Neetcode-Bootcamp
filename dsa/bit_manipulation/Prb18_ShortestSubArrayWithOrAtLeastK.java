package dsa.bit_manipulation;

import java.util.Arrays;

public class Prb18_ShortestSubArrayWithOrAtLeastK {
    private void addBits(int[] bitCount, int num){
        for(int i=0;i<31;i++){
            if((num&(1<<i))>0)
                bitCount[i]++;
        }
    }
    public int minimumSubarrayLength(int[] nums, int k) {
        int[] bitCount = new int[32];
        Arrays.fill(bitCount,0);
        int or = 0;
        int start = 0;
        System.out.println(k);
        int minLength = Integer.MAX_VALUE;
        for(int end = 0; end<nums.length;end++){
            or = or | nums[end];
            addBits(bitCount, nums[end]);
            while(or>=k && start<=end){
                minLength = Math.min(minLength, end-start+1);
                int remove = nums[start];
                for(int i=0;i<31;i++){
                    if((remove&(1<<i))>0){
                        bitCount[i]--;
                    }
                    if(bitCount[i]==0){
                        or = or & (~(1<<i));
                    }
                }
                start++;
            }
        }
        return  minLength == Integer.MAX_VALUE? -1: minLength;
    }
}
