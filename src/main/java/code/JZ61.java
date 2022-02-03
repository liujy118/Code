package code;

import java.util.Arrays;

/**
 * @Author K
 * @Description 剑指 Offer 61. 扑克牌中的顺子
 * @Mark 挺简单的一个题，做起来咋这么费劲呢
 * @Date 2022/2/3 11:57
 * @EndTime 12.10
 **/
public class JZ61 {
    public boolean isStraight(int[] nums) {
        int zeroCount = 0;
        int startInt = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroCount++;
            } else if (startInt == 0) {
                startInt = nums[i];
            } else if (startInt == nums[i]) {
                return false;
            } else if (nums[i] - startInt - 1 <= zeroCount) {
                zeroCount -= nums[i] - startInt - 1;
                startInt = nums[i];
            } else if (nums[i] - startInt - 1 > zeroCount) {
                return false;
            }
        }
        return true;
    }
}