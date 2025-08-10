package dsa.binarySearch;

import java.util.Arrays;

/*
Other approach is Sorting + Two Pointer

 */
public class Prb9_SuccessfullPairsOfSpellsAndPotions {
    public int getIndex(int[] potions, int power, long success){
        int l = 0;
        int h = potions.length-1;
        int ans = potions.length;

        while(l<=h){
            int mid = l + (h-l)/2;
            long curr = ((long)power*potions[mid]);
            if(curr>=success){
                ans = mid;
                h = mid-1;
            } else {
                l = mid+1;
            }
        }

        return ans;
    }
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int[] result = new int[spells.length];

        for(int i=0;i<spells.length;i++){
            int power = spells[i];
            int count = potions.length-getIndex(potions, power, success);
            result[i] = count;
        }

        return result;
    }
}
