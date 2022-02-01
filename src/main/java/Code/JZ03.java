package Code;

/**
 * 剑指 Offer 03. 数组中重复的数字
 * 换完一次需要原地再比较一次，因为可能错过换过来的数
 */
public class JZ03 {
    public int findRepeatNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == i){
                continue;
            }
            if (nums[i] == nums[nums[i]]){
                return nums[i];
            } else {
                int temp = nums[i];
                nums[i] = nums[temp];
                nums[temp] = temp;
                i--;
            }
        }
        return -1;
    }
}
