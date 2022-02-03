package code;

/**
 * @Author K
 * @Description 剑指 Offer 63. 股票的最大利润
 * @Mark
 * @Date 2022/2/3 20:02
 * @EndTime 20.05
 **/
public class JZ63 {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
        int minPrice = prices[0];
        int maxIncome = 0;
        for (int i = 1; i < prices.length; i++) {
            maxIncome = Math.max(prices[i] - minPrice, maxIncome);
            minPrice = Math.min(minPrice, prices[i]);
        }
        return maxIncome;
    }
}