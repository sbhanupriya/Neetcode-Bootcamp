package dsa.bit_manipulation;

import java.util.HashMap;

public class Prb28_FindTheLongestSubstringContainingVowelsInEvenCounts {
    private boolean isVowel(Character ch){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            return true;
        else
            return false;
    }
    public int findTheLongestSubstring(String s) {
        int len = 0;
        int start = 0;
        int xor = 0;
        HashMap<Integer,Integer> hashmap = new HashMap<>();
        hashmap.put(xor,-1);
        for(int end = 0; end<s.length(); end++){
            if(isVowel(s.charAt(end))){
                xor = xor ^ (s.charAt(end)-'a'+1);
            }
            if(hashmap.get(xor)!=null){
                len = Math.max(len, end-hashmap.get(xor));
            } else {
                hashmap.put(xor,end);
            }
        }
        return len;
    }
}
