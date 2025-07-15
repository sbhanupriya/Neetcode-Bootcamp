package dsa.binarySearch;

public class Prb4_ArrangingCoins {
    public int arrangeCoins(int n) {
        int low = 1;
        int high = n;
        int ans = -1;
        while(low<=high){
            int mid = low + (high-low)/2;
            long stairs = ((long)mid*(mid+1))/2;
            if(stairs<=n){
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }
}
