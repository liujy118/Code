package code;

/**
 * @Author K
 * @Description 剑指 Offer 56 - I. 数组中数字出现的次数
 * @Mark
 * @Date 2022/2/3 10:50
 * @EndTime 10.58
 **/
public class JZ56 {
    public int[] singleNumbers(int[] nums) {
        int k = 0;
        // 扫第一遍，找出两个不同的异或来
        for (int num : nums) {
            k ^= num;
        }
        int i = 0;
        // 找出最小的不同的位
        while ((k & 1) != 1) {
            i++;
            k = k >> 1;
        }
        int m = 1;
        // 扫第二遍，不同位为1的异或，不同位为0的异或，结果就是那两个数
        for (int j = 0; j < i; j++) {
            m = m << 1;
        }
        int a1 = 0;
        int a2 = 0;
        for (int num : nums) {
            if ((num & m) == m) {
                a1 = a1 ^ num;
            } else {
                a2 = a2 ^ num;
            }
        }
        return new int[]{a1, a2};
    }
}