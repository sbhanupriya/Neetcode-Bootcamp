package dsa.binarySearch;

public class Prb3_GuessNumberHigherOrLower {
    private int guess(int n){
        if(n==5)
            return 0;
        else if(n>5)
            return -1;
        else
            return 1;
    }
    public int guessNumber(int n) {
        int left = 1;
        int right = n;
        while(left<=right){
            int mid = left + (right-left)/2;
            int guess = guess(mid);
            if(guess==0)
                return mid;
            else if(guess==-1){
                right = mid -1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}
