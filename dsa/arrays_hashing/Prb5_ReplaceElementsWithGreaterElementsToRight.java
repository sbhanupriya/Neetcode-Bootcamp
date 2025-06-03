package dsa.arrays_hashing;

public class Prb5_ReplaceElementsWithGreaterElementsToRight {
    public static  int[] replaceElements(int[] arr) {
        int greater = -1;
        for(int index = arr.length-1;index>=0;index--){
            int curr = arr[index];
            arr[index] = greater;
            greater  = Math.max(greater, curr);
        }
        return arr;
    }
    public static  void main(String[] args){
        int[] nums = new int[]{1,2,6,9,0,1};
        for(int elem: replaceElements(nums)){
            System.out.print(elem + " ");
        }
    }
}
