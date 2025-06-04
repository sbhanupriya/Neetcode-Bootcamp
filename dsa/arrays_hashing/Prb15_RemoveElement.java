package dsa.arrays_hashing;

public class Prb15_RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int nextElem = 0;
        int index = 0;
        while(nextElem < nums.length){
            if(nums[nextElem]!=val){
                nums[index++] = nums[nextElem];
            }
            nextElem ++;
        }
        return index;
    }
    public static void main(String[] args){
        System.out.println(removeElement(new int[]{100,1,1,1,1,1,1}, 1));
    }
}
