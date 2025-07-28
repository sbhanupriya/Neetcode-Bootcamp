package dsa.bit_manipulation;

public class Prb15_LargestCombinationWithBitwiseAndGreaterThanZero {
    public int largestCombination(int[] candidates) {
        int[] bitCount = new int[32];

        for(int i=0;i<candidates.length;i++){
            for(int k=0;k<bitCount.length;k++){
                int mask = (1<<k);
                if((mask&candidates[i])>0){
                    bitCount[k]++;
                }
            }
        }

        int maxSize = 0;
        for(int i=0;i<bitCount.length;i++){
            maxSize = Math.max(bitCount[i], maxSize);
        }

        return maxSize;
    }
}
