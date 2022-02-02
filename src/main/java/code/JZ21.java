package code;

/**
 * @Author Jingyu Liu
 * @Description 剑指 Offer 21. 调整数组顺序使奇数位于偶数前面
 * @Mark
 * @Date 2022/2/2 8:55
 * @EndTime 8.59
 **/
public class JZ21 {
    public int[] exchange(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            while (left < right && nums[left] % 2 == 1) {
                left++;
            }
            while (left < right && nums[right] % 2 == 0) {
                right--;
            }
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
        return nums;
    }
}