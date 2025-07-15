package dsa.two_pointers;

public class Prb33_MinimumTimeToMakeRopeColorful {
    public int minCost(String colors, int[] neededTime) {
        if(colors.length()<=1){
            return 0;
        }

        int maxima = neededTime[0];
        int time = maxima;

        for(int index = 1;index<colors.length(); index++){
            if(colors.charAt(index)==colors.charAt(index-1)){
                maxima = Math.max(maxima, neededTime[index]);
                time += neededTime[index];
            } else {
                time -= maxima;
                maxima = neededTime[index];
                time += neededTime[index];
            }
        }

        time -= maxima;

        return time;
    }

    public static void main(String[] args){
        System.out.println(new Prb33_MinimumTimeToMakeRopeColorful().minCost("aaabbbaaab", new int[]{1,1,1,1,1,1,1,1,1,1}));
    }
}
