package dsa.bit_manipulation;

public class Prb17_MaximumXorForEachQuery {
    public int[] getMaximumXor(int[] nums, int maximumBit) {

        int[] result = new int[nums.length];
        int xor = 0;
        for(int i=0;i<nums.length;i++){
            xor = xor ^ nums[i];
        }

        int mask = (1<<maximumBit)-1;
        int index = nums.length-1;
        for(int j=0;j<nums.length;j++){
            result[j] = (mask^xor);
            xor = xor ^ nums[index--];
        }
        return result;
    }
}
