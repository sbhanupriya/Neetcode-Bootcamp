package dsa.stack;

import java.util.ArrayDeque;
import java.util.Deque;

/*
Time Complexity O(N)
Space Complexity O(N)
 */

public class Prb3_ValidParenthesis {
    private boolean isOpeningBracket(Character ch){
        if(ch=='('|| ch=='{' || ch=='[')
            return true;
        else
            return false;
    }
    private Character getClosingBracket(Character ch){
        if(ch=='}')
            return '{';
        else if(ch==']')
            return '[';
        else if(ch==')')
            return '(';
        else
            return '*';
    }
    public boolean isValid(String s) {
        Deque<Character> deque = new ArrayDeque<>();
        for(int i=0;i<s.length();i++){
            if(isOpeningBracket(s.charAt(i))){
                deque.offerLast(s.charAt(i));
            } else {
                if(deque.size()>0 && deque.peekLast()== getClosingBracket(s.charAt(i)))
                    deque.pollLast();
                else
                    return false;
            }
        }
        return deque.size()==0;
    }

    public static void main(String[] args){
        System.out.println(new Prb3_ValidParenthesis().isValid("{}[]({[]})"));
    }
}
