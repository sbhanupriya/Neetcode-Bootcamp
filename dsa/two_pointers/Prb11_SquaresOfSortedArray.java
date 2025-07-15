package dsa.two_pointers;

public class Prb11_SquaresOfSortedArray {
    public int[] sortedSquares(int[] nums) {
        int[] squares = new int[nums.length];
        int index = squares.length-1;
        int left = 0;
        int right = nums.length-1;
        while(left<=right){
            if(Math.abs(nums[left])>Math.abs(nums[right])){
                squares[index--] = nums[left]*nums[left];
                left++;
            } else {
                squares[index--] = nums[right]*nums[right];
                right--;
            }
        }
        return squares;
    }
    public static void main(String[] args){
        int[] squares = new Prb11_SquaresOfSortedArray().sortedSquares(new int[]{-4,-3,-2,1,6,7,8});
        for(int i=0;i<squares.length;i++){
            System.out.print(squares[i] + " ");
        }
    }
}
