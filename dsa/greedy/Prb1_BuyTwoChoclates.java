package dsa.greedy;

import java.util.Arrays;

public class Prb1_BuyTwoChoclates {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int leftOver = money - prices[0] - prices[1];
        return leftOver>=0 ? leftOver : money;
    }
}
