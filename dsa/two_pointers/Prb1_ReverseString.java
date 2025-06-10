package dsa.two_pointers;

public class Prb1_ReverseString {
    public static void reverseString(char[] s) {
        int st = 0;
        int et = s.length-1;
        while(st<et){
            char ch = s[st];
            s[st] = s[et];
            s[et] = ch;
            st++;
            et--;
        }
    }
    public static void main(String[] args){
        char[] ch = new char[]{'a','b','c','d','c'};
        reverseString(ch);
        System.out.println(ch);
    }
}
