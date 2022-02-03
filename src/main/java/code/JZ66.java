package code;

/**
 * @Author K
 * @Description 剑指 Offer 66. 构建乘积数组
 * @Mark
 * @Date 2022/2/3 14:25
 * @EndTime 14.41
 **/
public class JZ66 {
    public int[] constructArr(int[] a) {
        int[] leftArr = new int[a.length];
        int[] rightArr = new int[a.length];
        int[] constructArr = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            if (i == 0) {
                leftArr[i] = a[i];
            } else {
                leftArr[i] = leftArr[i - 1] * a[i];
            }
        }
        for (int i = 0; i < a.length; i++) {
            if (i == 0) {
                rightArr[i] = a[a.length - i - 1];
            } else {
                rightArr[i] = rightArr[i - 1] * a[a.length - i - 1];
            }
        }
        for (int i = 0; i < constructArr.length; i++) {
            int leftValue = i - 1 < 0 ? 1 : leftArr[i - 1];
            int rightValue = constructArr.length - i - 2 < 0 ? 1 : rightArr[constructArr.length - i - 2];
            constructArr[i] = leftValue * rightValue;
        }
        return constructArr;
    }
}