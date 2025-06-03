package dsa.arrays_hashing;

public class Prb8_LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        int prev = 0;
        int curr = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)== ' '){
                curr = 0;
            } else {
                curr ++;
                prev = curr;
            }
        }
        return prev;
    }
    public static void main(String[] args){
        System.out.println(lengthOfLastWord("My name is Bhanu   "));
    }
}
