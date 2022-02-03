package code;

/**
 * @Author K
 * @Description 剑指 Offer 64. 求1+2+…+n
 * @Mark
 * @Date 2022/2/3 11:13
 * @EndTime 11.19
 **/
public class JZ64 {
    public int sumNums(int n) {
        boolean x = n > 1 && (n = n + sumNums(n - 1)) > 0;
        return n;
    }
}