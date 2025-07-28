package dsa.bit_manipulation;

public class Prb9_ShuffleTheArray {
    public int[] shuffle(int[] nums, int n) {

        //brute force
        // int[] result = new int[nums.length];
        // int evenIndex = 0;
        // int oddIndex = n;
        // for(int i=0;i<result.length;i++){
        //     if(i%2==0)
        //     result[i] = nums[evenIndex++];
        //     else
        //     result[i] = nums[oddIndex++];
        // }
        // return result;



        //Optimised Time O(N) Space O(1)
        for(int i=0;i<nums.length/2;i++){
            nums[i] = nums[i]<<10;
            nums[i] = nums[i]|(nums[i+n]);
        }

        int j=2*n-1;
        for(int k=n-1;k>=0;k--){
            nums[j] = nums[k]&((1<<10)-1);
            nums[j-1] = nums[k]>>10;
            j=j-2;
        }
        return nums;
    }
}
