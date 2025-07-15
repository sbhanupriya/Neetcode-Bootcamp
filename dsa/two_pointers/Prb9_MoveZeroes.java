package dsa.two_pointers;

/*
Time O(N)
Space O(1)
 */

public class Prb9_MoveZeroes {
    public void moveZeroes(int[] nums) {
        int index1 = 0;
        int index = 0;

        while(index1<nums.length){
            if(nums[index1]==0)
                index1++;
            else {
                nums[index] = nums[index1];
                if(index1!=index)
                    nums[index1] = 0;
                index1++;
                index++;
            }
        }
    }
    public static void main(String[] args){
        int[] arr = new int[] {9,8,0,0,1,1,3};
       new Prb9_MoveZeroes().moveZeroes(arr);
       for(int i=0;i<arr.length;i++)
       System.out.print(arr[i] + " ");
    }
}
