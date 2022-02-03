package code;

/**
 * @Author K
 * @Description 剑指 Offer 53 - II. 0～n-1中缺失的数字
 * @Mark
 * @Date 2022/2/3 11:03
 * @EndTime 11.12
 **/
public class JZ53_2 {
    public int missingNumber(int[] nums) {
        if (nums.length == 0) {
            return 1;
        }
        if (nums.length == 1) {
            return nums[0] ^ 1;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == i || nums[i] == nums.length) {
                continue;
            } else {
                int temp = nums[nums[i]];
                nums[nums[i]] = nums[i];
                nums[i] = temp;
                i--;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                return i;
            }
        }
        return nums.length;
    }
}