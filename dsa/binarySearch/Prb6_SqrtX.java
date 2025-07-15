package dsa.binarySearch;

public class Prb6_SqrtX {
    public int mySqrt(int x) {
        if(x<=1)
            return x;

        int low = 1;
        int high = x/2;
        int ans = -1;

        while(low<=high){
            int mid = low + (high-low)/2;
            long squared = (((long)mid)*(mid));
            if(squared<=x){
                ans = mid;
                low = mid + 1;
            } else {
                high = mid -1;
            }
        }

        return ans;

    }
}
