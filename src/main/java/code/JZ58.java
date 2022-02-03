package code;

/**
 * @Author K
 * @Description 剑指 Offer 58 - I. 翻转单词顺序
 * @Mark 还治不了你了
 * @Date 2022/2/3 19:37
 * @EndTime 19.57
 **/
public class JZ58 {
    public String reverseWords(String s) {
        s = s.trim().replaceAll("\\s+", " ");
        char[] chars = s.toCharArray();
        if (chars.length == 0) {
            return "";
        }
        int startIndex = -1;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ' && startIndex != -1) {
                reverseCharArray(chars, startIndex, i - 1);
                startIndex = -1;
            } else if (chars[i] != ' ' && startIndex == -1) {
                startIndex = i;
            }
        }
        if (startIndex != -1) {
            reverseCharArray(chars, startIndex, chars.length - 1);
        }
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