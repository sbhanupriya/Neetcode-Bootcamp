package dsa.arrays_hashing;


/*
Brute Force -> Time O(N) Space O(N)
*/

public class Prb2_ConcatenationOfArray {
    public static int[] concat(int[] nums){
        int[] res = new int[nums.length*2];
        for(int i=0;i<nums.length;i++){
            res[i] = nums[i];
            res[i+nums.length] = nums[i];
        }
        return res;
    }
    public static void main(String[] args){
        int[] arr={1,2,4};
        int[] res = concat(arr);
        for(int elem: res)
        System.out.print(elem + " ");
    }
}
