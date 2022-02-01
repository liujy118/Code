package code;

/**
 * @Author Jingyu Liu
 * @Description 剑指 Offer 47. 礼物的最大价值
 * @Mark
 * @Date 2022/2/1 23:14
 * @EndTime 23.20
 **/
public class JZ47 {
    public int maxValue(int[][] grid) {
        int xLen = grid.length;
        int yLen = grid[0].length;
        int[][] dp = new int[xLen][yLen];
        for (int i = 0; i < xLen; i++) {
            for (int j = 0; j < yLen; j++) {
                int topMax = 0;
                int leftMax = 0;
                if (i - 1 >= 0) {
                    topMax = dp[i - 1][j];
                }
                if (j - 1 >= 0) {
                    leftMax = dp[i][j - 1];
                }
                dp[i][j] = Math.max(topMax, leftMax) + grid[i][j];
            }
        }
        return dp[xLen - 1][yLen - 1];
    }
}