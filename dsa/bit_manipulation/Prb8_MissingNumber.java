package dsa.bit_manipulation;

public class Prb8_MissingNumber {

    public static int missingNumber(int[] nums) {
        int xor = 0;
        for(int i=1;i<=nums.length;i++){
            xor = xor ^ i;
        }
        for(int i=0;i<nums.length;i++){
            xor = xor ^ (nums[i]);
        }
        return xor;
    }
    public static void main(String[] args){
        System.out.println(missingNumber(new int[]{0,2}));
    }
}
