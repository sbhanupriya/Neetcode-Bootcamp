package dsa.bit_manipulation;
/*
Brute Force -> Time O(N^2) 2 loops,Check each elem it should be coming twice if not return Space O(1)
Sorting -> Time O(NLOGN) Space O(1)
HashSet -> Time O(N) Space O(N)
Xor -> Time O(N) Space O(1)
*/

public class Prb1_SingleNumber {
    public int singleNumber(int[] nums) {
        int xor = 0;
        for(int elem: nums){
            xor = xor ^ elem;
        }
        return xor;
    }
}
