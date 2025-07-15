package dsa.sliding_window;

import java.util.HashMap;

public class Prb30_MinimumWindowSubstring {
    public String minWindow(String s, String t) {
        HashMap<Character, Integer> hashmap = new HashMap<>();
        for(int i=0;i<t.length();i++){
            hashmap.put(t.charAt(i), hashmap.getOrDefault(t.charAt(i),0)+1);
        }

        int count = hashmap.size();
        int windowSize = Integer.MAX_VALUE;
        int start = 0;
        int startIndex = -1;

        for(int end=0;end<s.length();end++) {
            if (hashmap.get(s.charAt(end)) != null) {
                int freq = hashmap.get(s.charAt(end)) - 1;
                hashmap.put(s.charAt(end), freq);
                if (freq == 0) {
                    count--;
                }
            }

            while (count == 0) {
                if (windowSize > (end - start + 1)) {
                    windowSize = end - start + 1;
                    startIndex = start;
                }


                if (hashmap.get(s.charAt(start)) != null) {
                    int freq = hashmap.get(s.charAt(start)) + 1;
                    hashmap.put(s.charAt(start), freq);
                    if (freq == 1) {
                        count++;
                    }
                }
                start++;
            }
        }
        return startIndex==-1?"":s.substring(startIndex, startIndex+windowSize);
    }
    public static void main(String[] args){
        System.out.println(new Prb30_MinimumWindowSubstring().minWindow("abbabaacbbat", "caat"));
    }
}
