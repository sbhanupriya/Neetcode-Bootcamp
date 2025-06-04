package dsa.arrays_hashing;

/*
Optimized  Time O(N+M) Space O(1)
Brute - try checking (0,i) substring is subsequence or not Time O(N2 + M)
*/
public class Prb7_AppendCharactersToMakeSubsequence {
    public static int appendCharacters(String s, String t) {
        int index1 = 0;
        int index2 = 0;
        while(index1<s.length() && index2<t.length()){
            if(s.charAt(index1)==t.charAt(index2)){
                index1++;
                index2++;
            } else {
                index1++;
            }
        }

        return t.length()-index2;
    }
    public static void main(String[] args){
        System.out.println(appendCharacters("coaching", "coding"));
    }
}
