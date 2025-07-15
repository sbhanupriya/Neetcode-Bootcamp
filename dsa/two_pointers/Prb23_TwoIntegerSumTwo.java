package dsa.two_pointers;

import java.util.Arrays;

public class Prb23_TwoIntegerSumTwo {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Arrays.fill(result,-1);

        int left = 0;
        int right = nums.length-1;
        while(left<right){
            int sum = nums[left]+nums[right];
            if(sum<target)
                left++;
            else if(sum>target)
                right--;
            else {
                result[0] = left+1;
                result[1] = right+1;
                break;
            }
        }
        return result;
    }

    public static void main(String[] agrs){
        int[] result = new Prb23_TwoIntegerSumTwo().twoSum(new int[]{1,2,4},3);
        System.out.println(result[0]+ " " + result[1]);
    }
}
