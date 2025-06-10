package dsa.two_pointers;

public class Prb3_ValidPallindrome2 {
    public static boolean checkPalin(String s, int start, int end){
        while(start<end){
            if(s.charAt(start)!=s.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }
    public static boolean validPalindrome(String s) {
        int start = 0;
        int end = s.length()-1;

        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
                return checkPalin(s, start+1, end) || checkPalin(s, start, end-1);
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args){
        System.out.println(validPalindrome("abbda"));
        System.out.println(validPalindrome("ababda"));
    }
}
