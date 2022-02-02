package code;

/**
 * @Author Jingyu Liu
 * @Description 剑指 Offer 16. 数值的整数次方
 * @Mark 快速幂，记一下
 * @Date 2022/2/2 20:25
 * @EndTime 20.30
 **/
public class JZ16 {
    public double myPow(double x, int n) {
        if (x == 0) {
            return 0;
        }
        double res = 1.0;
        long d = n;
        if (d < 0) {
            d = -d;
            x = 1 / x;
        }
        while (d > 0) {
            if ((d & 1) == 1) {
                res *= x;
            }
            x *= x;
            d = d >> 1;
        }
        return res;
    }
}