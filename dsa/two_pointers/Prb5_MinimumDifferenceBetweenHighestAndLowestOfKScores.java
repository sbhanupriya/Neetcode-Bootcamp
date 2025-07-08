package dsa.two_pointers;

import java.util.Arrays;

public class Prb5_MinimumDifferenceBetweenHighestAndLowestOfKScores {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int minDiff = nums[nums.length-1];
        int start = 0;
        for(int et=k-1;et<nums.length;et++){
            minDiff = Math.min(nums[et]-nums[start], minDiff);
            start++;
        }
        return minDiff;
    }
}
