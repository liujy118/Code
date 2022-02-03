package QuestionCode;

/**
 * @Author K
 * @Description
 * @Mark
 * @Date 2022/2/3 12:48
 * @EndTime
 **/
public class Question {
    public boolean solution(String S) {
        // 是否遍历了一个b
        boolean b = false;
        char[] chars = S.toCharArray();
        for (char c : chars) {
            if (!b && c == 'b') {
                b = true;
            } else if (c == 'a' && b) {
                return false;
            }
        }
        return true;
    }
}