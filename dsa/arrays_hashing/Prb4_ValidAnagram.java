package dsa.arrays_hashing;

/*
Brute Force  sorting -> Time O(NLOGN + MLOGM) Space O(1)
Hash -> Time O(N+M) Space O(1)
*/

public class Prb4_ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        int[] freq = new int[26];
        for(int index = 0;index<s.length();index++){
            freq[s.charAt(index)-'a']++;
        }

        for(int index=0;index<t.length();index++){
            freq[t.charAt(index)-'a']--;
        }

        for(int i=0;i<26;i++){
            if(freq[i]!=0)
                return false;
        }
        return true;
    }
    public static void main(String[] args){
        System.out.println(isAnagram("bhanu", "unhba"));
        System.out.println(isAnagram("bhanu", "unba"));
    }
}
