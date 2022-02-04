package code;

/**
 * @Author K
 * @Description 面试题19. 正则表达式匹配
 * @Mark 调试半天 bug一堆，真难，i j得分清，还有就是循环的次数要算准
 * @Date 2022/2/4 14:31
 * @EndTime 15.23
 **/
public class JZ19 {
    public boolean isMatch(String s, String p) {
        char[] sArr = s.toCharArray();
        char[] pArr = p.toCharArray();
        boolean[][] dp = new boolean[s.length() + 1][p.length() + 1];
        dp[0][0] = true;
        for (int i = 2; i < dp[0].length; i++) {
            if (dp[0][i - 2] && pArr[i - 1] == '*') {
                dp[0][i] = true;
            }
        }
        for (int i = 1; i < sArr.length + 1; i++) {
            for (int j = 1; j < pArr.length + 1; j++) {
                int di = i + 1;
                int dj = j + 1;
                if (pArr[j - 1] == '*') {
                    if (dp[di - 1][dj - 3]) {
                        dp[di - 1][dj - 1] = true;
                    }
                    if (dp[di - 2][dj - 1] && sArr[i - 1] == pArr[j - 2]) {
                        dp[di - 1][dj - 1] = true;
                    }
                    if (dp[di - 2][dj - 1] && pArr[j - 2] == '.') {
                        dp[di - 1][dj - 1] = true;
                    }
                } else {
                    if (dp[di - 2][dj - 2] && sArr[i - 1] == pArr[j - 1]) {
                        dp[di - 1][dj - 1] = true;
                    }
                    if (dp[di - 2][dj - 2] && pArr[j - 1] == '.') {
                        dp[di - 1][dj - 1] = true;
                    }
                }
            }
        }
        return dp[s.length()][p.length()];
    }
}