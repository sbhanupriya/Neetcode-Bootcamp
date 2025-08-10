package dsa.bit_manipulation;

public class Prb27_LongestNiceSubArray {
    public int longestNiceSubarray(int[] nums) {
        int or = 0;
        int len = 0;
        int start = 0;

        for(int end=0;end<nums.length;end++){
            while((or&nums[end])!=0){
                or = or^(nums[start]);
                start++;
            }
            or = or | nums[end];
            len = Math.max(len, end-start+1);
        }

        return len;
    }
}
