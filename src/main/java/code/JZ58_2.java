package code;

/**
 * @Author K
 * @Description 剑指 Offer 58 - II. 左旋转字符串
 * @Mark 啥也不是
 * @Date 2022/2/3 19:58
 * @EndTime 20.00
 **/
public class JZ58_2 {
    public String reverseLeftWords(String s, int n) {
        char[] chars = s.toCharArray();
        reverseCharArray(chars, 0, n - 1);
        reverseCharArray(chars, n, chars.length - 1);
        reverseCharArray(chars, 0, chars.length - 1);
        return String.valueOf(chars);
    }

    public void reverseCharArray(char[] chars, int startIndex, int endIndex) {
        while (startIndex < endIndex) {
            char tempChar = chars[startIndex];
            chars[startIndex] = chars[endIndex];
            chars[endIndex] = tempChar;
            startIndex++;
            endIndex--;
        }
    }
}