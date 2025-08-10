package dsa.arrays_hashing;

/*
Time complexity O(N)
Space completity O(1)
 */

public class Prb18_CanPlaceFlowers {

    private boolean check(int[] flowerbed, int index){
        if((flowerbed[index]==1) || (index-1>=0 && flowerbed[index-1]==1) ||
                (index+1<flowerbed.length && flowerbed[index+1]==1))
            return false;
        return true;
    }
    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        int end = 0;

        while(end<flowerbed.length){
            if(check(flowerbed,end)){
                flowerbed[end]=1;
                n--;
            }
            end++;
        }

        return n<=0;
    }
}
