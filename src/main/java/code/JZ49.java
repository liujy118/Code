package code;

/**
 * @Author Jingyu Liu
 * @Description 剑指 Offer 49. 丑数
 * @Mark 先看的思路，再一遍敲到底的，三指针动态规划，牛逼牛逼
 * @Date 2022/2/2 17:52
 * @EndTime 17.59
 **/
public class JZ49 {
    public int nthUglyNumber(int n) {
        int a = 0;
        int b = 0;
        int c = 0;
        int[] dp = new int[n];
        dp[0] = 1;
        for (int i = 1; i < dp.length; i++) {
            dp[i] = Math.min(Math.min(dp[a] * 2, dp[b] * 3), dp[c] * 5);
            if (dp[i] == dp[a] * 2) {
                a++;
            }
            if (dp[i] == dp[b] * 3) {
                b++;
            }
            if (dp[i] == dp[c] * 5) {
                c++;
            }

        }
        return dp[n - 1];
    }
}