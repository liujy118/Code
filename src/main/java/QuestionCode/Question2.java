package QuestionCode;

/**
 * @Author K
 * @Description
 * @Mark
 * @Date 2022/2/3 12:54
 * @EndTime
 **/

/**
 * 给你个二进制字符串，把二进制字符串表示的数值进行循环运算
 * 如果结果是偶数就除以2
 * 如果结果是奇数就减1
 * 直到变成0，返回运算的次数
 * 比如"011100"代表28，一共需要运算7次
 */
public class Question2 {
    public int solution(String S) {
        if (S == null || S.length() == 0) {
            return 0;
        }
        char[] chars = S.toCharArray();
        // m 位基数 ，s代表的值
        int m = 1;
        int n = 0;
        for (int i = chars.length - 1; i >= 0; i--) {
            if (chars[i] == '1') {
                n += m;
            }
            m = m << 1;
        }
        return getTimes(n, 0);
    }

    private int getTimes(int n, int times) {
        if (n == 0) {
            return times;
        }
        if ((n & 1) == 1) {
            return getTimes(n - 1, times + 1);
        } else {
            return getTimes(n >> 1, times + 1);
        }
    }
}