package dsa.two_pointers;

import java.util.Arrays;

public class Prb31_BoatsToSavePeople {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int low = 0;
        int high = people.length-1;
        int boat = 0;

        while(low<high){
            if(people[low]+people[high]<=limit){
                low++;
                high--;
            } else {
                high--;
            }
            boat++;
        }
        if(low==high)
            boat++;
        return boat;
    }

    public static void main(String[] args){
        System.out.println(new Prb31_BoatsToSavePeople().numRescueBoats(new int[]{5,1,4,2},6));
    }
}
