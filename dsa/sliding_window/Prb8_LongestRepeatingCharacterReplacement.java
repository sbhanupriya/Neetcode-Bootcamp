package dsa.sliding_window;

import java.util.HashMap;
/*
Time O(N)
no need to update the max frequency as per window
as better result will be only when maxFrequency is more
 */
public class Prb8_LongestRepeatingCharacterReplacement {
        public int characterReplacement(String s, int k) {
            HashMap<Character,Integer> hashmap = new HashMap<>();
            int start = 0;
            int maxLen = 0;
            int maxFreq = 0;

            for(int end=0;end<s.length();end++){
                hashmap.put(s.charAt(end), hashmap.getOrDefault(s.charAt(end),0)+1);
                maxFreq = Math.max(maxFreq, hashmap.get(s.charAt(end)));
                while((end-start+1-maxFreq)>k){
                    hashmap.put(s.charAt(start), hashmap.get(s.charAt(start))-1);
                    start++;
                }
                maxLen = Math.max(maxLen, end-start+1);
            }

            return maxLen;
        }

}
