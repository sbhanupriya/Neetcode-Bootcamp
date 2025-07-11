package dsa.arrays_hashing;

/*
Time O(N)
Space O(1)
 */
public class Prb11_MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxOnes = 0;
        int currOnes = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                currOnes++;
                maxOnes = Math.max(maxOnes, currOnes);
            } else {
                currOnes = 0;
            }
        }

        return maxOnes;
    }

    public static  void main(String[] args){
        System.out.println(new Prb11_MaxConsecutiveOnes().findMaxConsecutiveOnes(new int[]{1,1,1,0,1,1,1,1}));
    }
}
