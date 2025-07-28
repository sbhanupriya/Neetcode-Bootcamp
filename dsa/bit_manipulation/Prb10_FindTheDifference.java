package dsa.bit_manipulation;

public class Prb10_FindTheDifference {
    public char findTheDifference(String s, String t) {
        int xor = 0;
        for(int i=0;i<s.length();i++){
            xor = xor ^(s.charAt(i));
            xor = xor ^(t.charAt(i));
        }
        xor = xor ^((t.charAt(t.length()-1)));
        return (char)(xor);
    }
}
