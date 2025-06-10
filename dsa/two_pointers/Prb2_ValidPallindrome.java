package dsa.two_pointers;

public class Prb2_ValidPallindrome {
    public static boolean isAlphaNumeric(Character ch){
        if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z') ||
                (ch>='0' && ch<='9'))
            return true;
        else
            return false;
    }
    public static boolean compare(char ch1, char ch2){
        if(ch1>='A' && ch1<='Z'){
            ch1 = (char)(ch1+32);
        }

        if(ch2>='A' && ch2<='Z'){
            ch2 = (char)(ch2+32);
        }

        if(ch1==ch2)
            return true;
        else
            return false;
    }
    public static boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length()-1;
        while(start<end){
            if(!isAlphaNumeric(s.charAt(start))){
                start++;
                continue;
            }
            if(!isAlphaNumeric(s.charAt(end))){
                end--;
                continue;
            }
            if(!compare(s.charAt(start),s.charAt(end))){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args){
        System.out.println(isPalindrome("MADAM MADAM"));
        System.out.println(isPalindrome("MADAM MA DA  M"));
    }
}
