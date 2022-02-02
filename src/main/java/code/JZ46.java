package code;

/**
 * @Author Jingyu Liu
 * @Description 剑指 Offer 46. 把数字翻译成字符串
 * @Mark
 * @Date 2022/2/2 11:40
 * @EndTime 12.05
 **/
public class JZ46 {
    public int translateNum(int num) {
        String s = String.valueOf(num);
        int[] dp = new int[s.length()];
        char[] chars = s.toCharArray();
        dp[0] = 1;
        for (int i = 1; i < chars.length; i++) {
            int tempInt = (chars[i - 1] - '0') * 10 + (chars[i] - '0');
            if (tempInt >= 10 && tempInt <= 25) {
                if (i - 2 >= 0) {
                    dp[i] = dp[i - 1] + dp[i - 2];
                } else {
                    dp[i] = dp[i - 1] + 1;
                }
            } else {
                dp[i] = dp[i - 1];
            }
        }
        return dp[s.length() - 1];
    }
}