package dsa.bit_manipulation;

public class Prb7_ReverseBits {
    public static int reverseBits(int n) {
        int reversed = 0;
        for (int i = 31; i >= 0; i--) {
            int reversedIndex = 31 - i;
            if ((n & (1 << i)) != 0) {
                reversed |= (1 << reversedIndex);
            }
        }
        return reversed;
    }
    public static void main(String[] args){
        System.out.println(reverseBits(1));
    }
}
