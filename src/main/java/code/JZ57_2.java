package code;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author K
 * @Description 剑指 Offer 57 - II. 和为s的连续正数序列
 * @Mark
 * @Date 2022/2/3 14:03
 * @EndTime 14.22
 **/
public class JZ57_2 {
    public int[][] findContinuousSequence(int target) {
        List<int[]> resList = new ArrayList<>();
        int left = 1;
        int right = 1;
        int sum = 0;
        while (right < target) {
            if (sum < target) {
                sum += right;
                right++;
            } else if (sum > target) {
                sum -= left;
                left++;
            } else {
                resList.add(getSubArrayBetweenTwoValue(left, right - 1));
                sum -= left;
                left++;
                sum += right;
                right++;
            }
        }
        int[][] res = new int[resList.size()][0];
        for (int i = 0; i < res.length; i++) {
            res[i] = resList.get(i);
        }
        return res;
    }

    private int[] getSubArrayBetweenTwoValue(int start, int end) {
        int[] arr = new int[end - start + 1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = start + i;
        }
        return arr;
    }
}