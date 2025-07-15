package dsa.two_pointers;

public class Prb34_RearrangeArrayElementsBySign {
    public int[] rearrangeArray(int[] nums) {
        int nextPosIndex = 0;
        int nextNegIndex = 1;
        int index = 0;
        int[] res = new int[nums.length];

        while(index<nums.length){
            if(nums[index]<0){
                res[nextNegIndex] = nums[index];
                nextNegIndex += 2;
            } else {
                res[nextPosIndex] = nums[index];
                nextPosIndex+=2;
            }
            index++;
        }

        return res;
    }

    public static void main(String[] args){
        int[] res = new Prb34_RearrangeArrayElementsBySign().rearrangeArray(new int[]{-2,-3,-4,5,1,2,2,-7});

        for(int i=0;i<res.length;i++)
            System.out.print(res[i]);
    }

}
