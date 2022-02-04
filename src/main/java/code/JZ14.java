package code;

/**
 * @Author K
 * @Description 剑指 Offer 14- I. 剪绳子
 * @Mark
 * @Date 2022/2/4 16:14
 * @EndTime
 **/
public class JZ14 {
    public int cuttingRope(int n) {
        if (n <= 3) {
            return n - 1;
        }
        int a = n / 3;
        int b = n % 3;
        if (b == 0) {
            return (int) Math.pow(3, a);
        } else if (b == 1) {
            return (int) Math.pow(3, a - 1) * 4;
        } else {
            return (int) Math.pow(3, a) * 2;
        }
    }
}