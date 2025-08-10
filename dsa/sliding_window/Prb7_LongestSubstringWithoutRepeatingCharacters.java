package dsa.sliding_window;

import java.util.Arrays;

public class Prb7_LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int[] freq = new int[255];
        Arrays.fill(freq,-1);
        int start = 0;
        int ws = 0;

        for(int end = 0; end<s.length(); end++){
            int index = s.charAt(end);

            while(freq[index]!=-1){
                int remove = s.charAt(start);
                freq[remove]= -1;
                start++;
            }

            freq[index] = end;
            ws = Math.max(ws, end-start+1);
        }

        return ws;

    }
}
