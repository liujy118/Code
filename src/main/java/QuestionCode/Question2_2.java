package QuestionCode;

/**
 * @Author K
 * @Description
 * @Mark
 * @Date 2022/2/3 13:13
 * @EndTime
 **/
public class Question2_2 {
    public int solution(String S) {
        int i = S.indexOf("1");
        String shortS = S.substring(i);
        int times = 0;
        char[] chars = shortS.toCharArray();
        for (char c : chars) {
            if (c == '0') {
                times++;
            } else {
                times += 2;
            }
        }
        return times - 1;
    }
}