package code;

/**
 * @Author Jingyu Liu
 * @Description 剑指 Offer 39. 数组中出现次数超过一半的数字
 * @Mark
 * @Date 2022/2/2 11:34
 * @EndTime 11.38
 **/
public class JZ39 {
    public int majorityElement(int[] nums) {
        int num = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == num) {
                count++;
            } else {
                if (count == 0) {
                    num = nums[i];
                    count++;
                } else {
                    count--;
                }
            }
        }
        return num;
    }
}