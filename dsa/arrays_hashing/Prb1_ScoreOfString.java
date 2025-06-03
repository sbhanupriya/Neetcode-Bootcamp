package dsa.arrays_hashing;

/*
Brute Force -> Time O(N) Space O(1)
*/


public class Prb1_ScoreOfString {
    public static int score(String s){
        int score = 0;
        for(int i=0;i<s.length()-1;i++){
            score += Math.abs(s.charAt(i)-s.charAt(i+1));
        }
        return score;
    }
    public static void main(String[] args){
        for(String s:args){
            System.out.println(score(s));
        }
    }
}
