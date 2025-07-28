package dsa.bit_manipulation;

public class Prb14_BitwiseXorOfAllPairings {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int length1 = nums1.length;
        int length2 = nums2.length;

        int xor = 0;
        if(length2%2!=0){
            for(int i=0;i<nums1.length;i++){
                xor = xor^nums1[i];
            }
        }

        if(length1%2!=0){
            for(int i=0;i<nums2.length;i++){
                xor = xor ^ nums2[i];
            }
        }

        return xor;
    }
}
