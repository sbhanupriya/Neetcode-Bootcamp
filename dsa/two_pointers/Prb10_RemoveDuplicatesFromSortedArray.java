package dsa.two_pointers;

public class Prb10_RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates(int[] nums) {
        int nextElem = 1;
        for(int index = 1;index<nums.length;index++){
            if(nums[index]!=nums[nextElem-1]){
                nums[nextElem++] = nums[index];
            }
        }
        return nextElem;
    }
    public static void main(String[] args){
        System.out.println(removeDuplicates(new int[]{1,1,1,1,1,2,2,2,3,3,3,3}));
    }
}
