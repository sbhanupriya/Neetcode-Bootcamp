package dsa.sliding_window;

public class Prb2_BestTimeToSellAndBuy {
    public static int maxProfit(int[] prices) {
        int profit = 0;
        int cp = Integer.MAX_VALUE;

        for(int i = 0; i<prices.length;i++){
            profit = Math.max(profit, prices[i]-cp);
            cp = Math.min(cp, prices[i]);
        }

        return profit;

    }
    public static void main(String[] args){
        System.out.println(maxProfit(new int[]{10,1,5,6,7,1}));
    }
}
