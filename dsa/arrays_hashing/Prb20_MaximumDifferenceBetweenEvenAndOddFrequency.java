package dsa.arrays_hashing;

public class Prb20_MaximumDifferenceBetweenEvenAndOddFrequency {
    public int maxDifference(String s) {
        int odd = 0;
        int even = Integer.MAX_VALUE;
        int[] freq = new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }

        for(int i=0;i<26;i++){
            if(freq[i]>0){
                if(freq[i]%2==0){
                    even = Math.min(even, freq[i]);
                } else {
                    odd = Math.max(odd, freq[i]);
                }
            }
        }

        return odd-even;
    }
}
