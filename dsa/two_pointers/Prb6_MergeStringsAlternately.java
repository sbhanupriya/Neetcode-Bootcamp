package dsa.two_pointers;

public class Prb6_MergeStringsAlternately {
    public String mergeAlternately(String word1, String word2) {
        int start1 = 0;
        int start2 = 0;
        StringBuilder st = new StringBuilder();

        while(start1<word1.length() && start2<word2.length()){
            st.append(word1.charAt(start1++));
            st.append(word2.charAt(start2++));
        }
        if(start1<word1.length())
            st.append(word1.substring(start1,word1.length()));

        if(start2<word2.length())
            st.append(word2.substring(start2,word2.length()));

        return st.toString();
    }
}
