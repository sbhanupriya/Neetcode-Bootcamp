package dsa.bit_manipulation;

public class Prb6_MinimumBitFlipsToCovertNumber {
    public static int minBitFlips(int start, int goal) {
        int xor = start ^ goal;
        int flipCount = 0;
        while (xor != 0) {
            if ((xor & 1) != 0) {
                flipCount++;
            }
            xor >>= 1;
        }
        return flipCount;
    }
    public static void main(String[] args){
        System.out.println(minBitFlips(10,7));
    }
}
