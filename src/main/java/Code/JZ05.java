package Code;

/**
 * 剑指 Offer 05. 替换空格
 */
public class JZ05 {
    public String replaceSpace(String s) {
        char[] chars = s.toCharArray();
        int spaceCount = 0;
        for (char c : chars) {
            if (c == ' ') {
                spaceCount++;
            }
        }
        char[] res = new char[s.length() + spaceCount * 2];
        int j = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != ' ') {
                res[i + j] = chars[i];
            } else {
                res[i + j] = '%';
                res[i + j + 1] = '2';
                res[i + j + 2] = '0';
                j += 2;
            }
        }
        return String.copyValueOf(res);
    }
}
