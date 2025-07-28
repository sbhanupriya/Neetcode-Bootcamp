package dsa.bit_manipulation;

public class Prb2_SingleNumberThree {
    public int[] singleNumber(int[] nums) {
        int mask = 0;
        for(int i=0;i<nums.length;i++){
            mask = mask ^ nums[i];
        }
        mask = mask&(-mask);

        int group1 = 0;
        int group2 = 0;

        for(int i=0;i<nums.length;i++){
            if((mask&nums[i])>0){
                group1 = group1 ^ nums[i];
            } else {
                group2 = group2 ^ nums[i];
            }
        }

        return new int[]{group1,group2};
    }
}
