package code;

/**
 * @Author Jingyu Liu
 * @Description 剑指 Offer 15. 二进制中1的个数
 * @Mark
 * @Date 2022/2/2 8:45
 * @EndTime 8.53
 **/
public class JZ15 {
    public int hammingWeight(int n) {
        int count = 0;
        int index = 32;
        while (index-- > 0) {
            if ((n & 1) == 1) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }
}