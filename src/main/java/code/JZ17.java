package code;

/**
 * @Author Jingyu Liu
 * @Description 剑指 Offer 17. 打印从1到最大的n位数
 * @Mark
 * @Date 2022/2/2 11:27
 * @EndTime 11.34
 **/
public class JZ17 {
    public int[] printNumbers(int n) {
        int i = (int) Math.pow(10, n);
        int[] numbers = new int[i - 1];
        for (int j = 1; j < i; j++) {
            numbers[j - 1] = j;
        }
        return numbers;
    }
}