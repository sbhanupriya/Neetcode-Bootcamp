package dsa.two_pointers;

public class Prb19_AddSpacesToString {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder st = new StringBuilder();

        int spaceIndex = 0;
        int i = 0;
        while(spaceIndex<spaces.length){
            while(i<s.length() && i<spaces[spaceIndex]){
                st.append(s.charAt(i++));
            }
            st.append(' ');
            spaceIndex++;
        }
        if(i<s.length()){
            st.append(s.substring(i,s.length()));
        }
        return st.toString();
    }
    public static void main(String[] args){
        System.out.println(new Prb19_AddSpacesToString().addSpaces("BhanuPriyaisGoogleEngineer", new int[]{5,10,12,18}));
    }
}
