package dsa.two_pointers;

public class Prb13_FindFirstPallindromicStringInArray {
    private boolean isPallindrome(String word){
        int left = 0;
        int right = word.length()-1;
        while(left<right){
            if(word.charAt(left)==word.charAt(right)){
                left++;
                right--;
            } else {
                return false;
            }
        }
        return true;
    }
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++){
            if(isPallindrome(words[i]))
                return words[i];
        }
        return "";
    }

    public static void main(String[] args){
        System.out.println(new Prb13_FindFirstPallindromicStringInArray().firstPalindrome(new String[]{"abb", "abh", "aba", "tyyt"}));
    }
}
