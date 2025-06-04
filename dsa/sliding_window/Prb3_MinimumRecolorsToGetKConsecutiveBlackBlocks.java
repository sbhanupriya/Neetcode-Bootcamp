package dsa.sliding_window;

public class Prb3_MinimumRecolorsToGetKConsecutiveBlackBlocks {
    public static int minimumRecolors(String blocks, int k){
        int operations = k;
        int blackCount = 0;
        int start = 0;
        for(int end = 0; end<blocks.length();end++){
            if(blocks.charAt(end)=='B')
                blackCount++;
            operations = Math.min(operations, k-blackCount);
            if(end-start+1==k){
                if(blocks.charAt(start)=='B')
                    blackCount--;
                start++;
            }
        }
        return operations;
    }
}
