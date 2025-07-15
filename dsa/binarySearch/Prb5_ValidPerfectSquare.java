package dsa.binarySearch;

public class Prb5_ValidPerfectSquare {
    public boolean isPerfectSquare(int num) {
        if(num<2)
            return true;

        int low = 1;
        int high = num/2;
        while(low<=high){
            int mid =  low + (high-low)/2;
            long perfectSquare = ((long)mid*mid);
            if(perfectSquare==num)
                return true;
            else if(perfectSquare>num)
                high = mid - 1 ;
            else
                low = mid + 1;
        }

        return false;
    }
}
