package code;

/**
 * @Author K
 * @Description 剑指 Offer 43. 1～n 整数中 1 出现的次数
 * @Mark
 * @Date 2022/2/4 12:05
 * @EndTime 12.30
 **/
public class JZ43 {
    public int countDigitOne(int n) {
        long digit = 1;
        int high = n / 10;
        int low = 0;
        int count = 0;
        int cur = n % 10;
        while (high != 0 || cur != 0) {
            if (cur == 0) {
                count += digit * high;
            } else if (cur == 1) {
                count += digit * high + low + 1;
            } else {
                count += digit * (high + 1);
            }
            digit *= 10;
            high = (int) (n / digit / 10);
            cur = (int) (((n % (digit * 10)) - (n % digit)) / digit);
            low = (int) (n % digit);
        }
        return count;
    }
}