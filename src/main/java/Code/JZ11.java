package Code;

/**
 * 剑指 Offer 11. 旋转数组的最小数字
 * 是个hard，在剑指offer里边居然是easy。。。
 */
public class JZ11 {
    public int minArray(int[] numbers) {
        int left = 0;
        int right = numbers.length-1;
        while (left<right){
            int middle = left + (right-left)/2;
            if (numbers[middle]>numbers[right]){
                left = middle +1;
            }else if (numbers[middle]<numbers[left]){
                right = middle;
            }else {
               right--;
            }
        }
            return numbers[left];
    }

}
