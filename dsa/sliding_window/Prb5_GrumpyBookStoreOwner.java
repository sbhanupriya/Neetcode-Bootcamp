package dsa.sliding_window;

public class Prb5_GrumpyBookStoreOwner {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int count = 0;
        int cust = 0;
        int maxGrumpy = 0;
        int start = 0;

        for(int end = 0; end<customers.length; end ++){
            if(grumpy[end]==1){
                count += customers[end];
            } else {
                cust += customers[end];
            }
            maxGrumpy = Math.max(maxGrumpy, count);
            if((end-start+1)==minutes){
                if(grumpy[start]==1){
                    count -= customers[start];
                }
                start++;
            }
            //System.out.println(maxGrumpy + " " + count);
        }

        return maxGrumpy + cust;
    }
}
