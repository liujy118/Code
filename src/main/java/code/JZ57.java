package code;

/**
 * @Author K
 * @Description 剑指 Offer 57. 和为s的两个数字
 * @Mark 两数之和
 * @Date 2022/2/3 11:20
 * @EndTime 11.23
 **/
public class JZ57 {
    public int[] twoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= nums.length - 1 && right >= 0) {
            int sum = nums[left] + nums[right];
            if (sum == target) {
                return new int[]{nums[left], nums[right]};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[0];
    }
}