package code;

/**
 * @Author K
 * @Description 剑指 Offer 60. n个骰子的点数
 * @Mark 是6的n次方种可能，不是6*n
 * @Date 2022/2/3 11:30
 * @EndTime 11.53
 **/
public class JZ60 {
    public double[] dicesProbability(int n) {
        int[][] dp = new int[n][6 * n];
        double[] res = new double[5 * n + 1];
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 6 * n; j++) {
                if (i == 0) {
                    if (j < 6) {
                        dp[i][j] = 1;
                    }
                } else {
                    dp[i][j] = getDpValue(dp, i - 1, j - 1) + getDpValue(dp, i - 1, j - 2) + getDpValue(dp, i - 1, j - 3) +
                            getDpValue(dp, i - 1, j - 4) + getDpValue(dp, i - 1, j - 5) + getDpValue(dp, i - 1, j - 6);
                }
                if (i == n - 1 && dp[i][j] != 0) {
                    res[index++] = dp[i][j] / Math.pow(6, n);
                }
            }
        }
        return res;
    }

    public int getDpValue(int[][] dp, int i, int j) {
        return j < 0 ? 0 : dp[i][j];
    }
}