package dsa.two_pointers;

public class Prb21_RemoveDuplicatesFromSortedArray2 {
    public int removeDuplicates(int[] nums) {
        int nextIndex = 1;
        int freq = 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1])
                freq++;
            else
                freq=1;

            if(freq<=2){
                nums[nextIndex++] = nums[i];
            }
        }

        return nextIndex;
    }
    public static void main(String[] args){
        int[] arr = new int[]{1,1,1,1,2,2,2,2,2,3,3,3,3,3,3};
        int newLength = new Prb21_RemoveDuplicatesFromSortedArray2().removeDuplicates(arr);
        for(int i=0;i<newLength;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
