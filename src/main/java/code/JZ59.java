package code;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @Author Jingyu Liu
 * @Description 剑指 Offer 59 - I. 滑动窗口的最大值
 * @Mark
 * @Date 2022/2/2 19:38
 * @EndTime 19.54
 **/
public class JZ59 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return new int[0];
        }
        if (k >= nums.length) {
            int max = nums[0];
            for (int i = 1; i < nums.length; i++) {
                max = Math.max(max, nums[i]);
            }
            return new int[]{max};
        }
        int[] res = new int[nums.length - k + 1];
        Deque<Integer> deque = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }
            deque.offerLast(i);
            if (!deque.isEmpty() && deque.peekFirst() <= i - k) {
                deque.pollFirst();
            }
            if (i + 1 - k >= 0 && !deque.isEmpty()) {
                res[i + 1 - k] = nums[deque.peekFirst()];
            }
        }
        return res;
    }
}