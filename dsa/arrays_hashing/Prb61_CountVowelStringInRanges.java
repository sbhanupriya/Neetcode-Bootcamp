package dsa.arrays_hashing;

public class Prb61_CountVowelStringInRanges {
    private boolean isVowel(Character ch){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            return true;
        else
            return false;
    }
    private boolean isValid(String s){
        return isVowel(s.charAt(0)) && isVowel(s.charAt(s.length()-1));
    }
    public int[] vowelStrings(String[] words, int[][] queries) {
        int[] prefix = new int[words.length];

        for(int i=0;i<words.length;i++){
            prefix[i] = isValid(words[i])?1:0;
            if(i-1>=0){
                prefix[i]+= prefix[i-1];
            }
        }

        int[] result = new int[queries.length];
        for(int i=0;i<queries.length;i++){
            int st = queries[i][0];
            int end = queries[i][1];

            result[i] = prefix[end];
            if(st-1>=0)
                result[i] = result[i] - prefix[st-1];
        }

        return result;
    }
}
