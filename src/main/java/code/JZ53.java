package code;

/**
 * @Author Jingyu Liu
 * @Description 剑指 Offer 53 - I. 在排序数组中查找数字 I
 * @Date 2022/2/1 17:31
 * @EndTime 17.45
 **/
public class JZ53 {
    public int search(int[] nums, int target) {
        if (nums.length == 0) {
            return 0;
        }
        int left = 0;
        int right = nums.length - 1;
        // 二分找到target下标，即mid
        int count = 0;
        int mid = 0;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (nums[mid] > target) {
                right = mid - 1;
            } else if ((nums[mid] < target)) {
                left = mid + 1;
            } else {
                break;
            }
        }
        if (nums[mid] == target) {
            count++;
        }
        int leftIndex = mid;
        int rightIndex = mid;
        while (leftIndex - 1 >= 0 && nums[--leftIndex] == target) {
            count++;
        }
        while (rightIndex + 1 < nums.length && nums[++rightIndex] == target) {
            count++;
        }
        return count;
    }
}