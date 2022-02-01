package code;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Author Jingyu Liu
 * @Description 剑指 Offer 45. 把数组排成最小的数
 * @Mark 重写比较器 时，考虑特殊情况0的时候，不光要考虑o1还有o2
 * @Date 2022/2/1 19:19
 * @EndTime 22.27 睡了一觉
 **/
public class JZ45 {
    public String minNumber(int[] nums) {
        Integer[] helper = new Integer[nums.length];
        for (int i = 0; i < nums.length; i++) {
            helper[i] = nums[i];
        }
        Arrays.sort(helper, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 == 0) {
                    return -1;
                }
                if (o2 == 0) {
                    return 1;
                }
                return o1 * (int) Math.pow(10, (int) Math.log10(o2) + 1) + o2 -
                        (o2 * (int) Math.pow(10, (int) Math.log10(o1) + 1) + o1);
            }
        });
        StringBuilder builder = new StringBuilder();
        for (Integer integer : helper) {
            builder.append(integer);
        }
        return new String(builder);
    }
}
