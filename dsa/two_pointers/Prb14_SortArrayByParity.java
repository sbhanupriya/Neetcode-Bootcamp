package dsa.two_pointers;

public class Prb14_SortArrayByParity {
    public int[] sortArrayByParity(int[] nums) {
        int even = 0;
        int index = 0;
        while(index<nums.length){
            if(nums[index]%2==0){
                int curr = nums[even];
                nums[even] = nums[index];
                nums[index] = curr;
                even++;
            }
            index++;
        }

        return nums;
    }
    public static void main(String[] args){
        int[] res = new Prb14_SortArrayByParity().sortArrayByParity(new int[]{2,4,5,3,1,7,8});
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+ " ");
        }
    }
}
