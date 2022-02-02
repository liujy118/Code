package code;

/**
 * @Author Jingyu Liu
 * @Description 剑指 Offer 10- II. 青蛙跳台阶问题
 * @Mark
 * @Date 2022/2/2 18:04
 * @EndTime 18.09
 **/
public class JZ10_2 {
    public int numWays(int n) {
        if (n == 0) {
            return 1;
        }
        if (n <= 2) {
            return n;
        }
        int[] dp = new int[n];
        dp[0] = 1;
        dp[1] = 2;
        for (int i = 2; i < dp.length; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % 1000000007;
        }
        return dp[n - 1];
    }
}