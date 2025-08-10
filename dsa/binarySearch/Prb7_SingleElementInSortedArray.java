package dsa.binarySearch;

public class Prb7_SingleElementInSortedArray {
    class Solution {
        private boolean isValid(int index, int[] nums){
            if(index%2==0 && index+1<nums.length)
                return nums[index]==nums[index+1];
            if(index%2!=0 && index-1>=0)
                return nums[index]==nums[index-1];
            return false;
        }
        public int singleNonDuplicate(int[] nums) {
            int start = 0;
            int end = nums.length-1;

            while(start<end){
                int mid = start + (end-start)/2;
                if(isValid(mid, nums)){
                    start = mid%2==0 ? mid+2:mid+1;
                } else {
                    end = mid-1;
                }
            }
            return nums[start];
        }
    }
}
