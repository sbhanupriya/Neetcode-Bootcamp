package dsa.two_pointers;

public class Prb32_KthSymbolInGrammar {
    private int helper(int n,int k){
        if(n==1 && k==0)
            return 0;

        int value = helper(n-1, k/2);
        if(k%2==0)
            return value;
        else
            return Math.abs(1-value);
    }
    public int kthGrammar(int n, int k) {
        if(n==1 && k==0){
            return 0;
        }

        return helper(n,k-1);
    }
}
