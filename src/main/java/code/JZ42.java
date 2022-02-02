package code;

/**
 * @Author Jingyu Liu
 * @Description 剑指 Offer 42. 连续子数组的最大和
 * @Mark
 * @Date 2022/2/2 21:15
 * @EndTime 21.21
 **/
public class JZ42 {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currentSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (currentSum < 0) {
                currentSum = 0;
            }
            currentSum += nums[i];
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
}