package code;

/**
 * @Author K
 * @Description
 * @Mark
 * @Date 2022/2/4 16:20
 * @EndTime
 **/
public class JZ14_2 {
    public int cuttingRope(int n) {
        if (n == 2)
            return 1;
        if (n == 3)
            return 2;
        long res = 1;
        while (n > 4) {
            res *= 3;
            res = res % 1000000007;
            n -= 3;
        }
        return (int) (res * n % 1000000007);
    }
}