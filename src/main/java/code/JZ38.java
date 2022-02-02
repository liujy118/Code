package code;

import java.util.*;

/**
 * @Author Jingyu Liu
 * @Description 剑指 Offer 38. 字符串的排列
 * @Mark 1 栈的to string。2 回溯法注意break和continue的细节
 * @Date 2022/2/2 15:52
 * @EndTime 16.34
 **/
public class JZ38 {

    char[] chars;
    int[] marks;
    Stack<Character> stack = new Stack<>();
    Set<String> set = new HashSet<>();
    int length = 0;

    public String[] permutation(String s) {
        chars = s.toCharArray();
        marks = new int[chars.length];
        permutationHelper();
        return set.toArray(new String[0]);
    }

    public void permutationHelper() {
        if (length == chars.length) {
            Character[] characters = stack.toArray(new Character[chars.length]);
            StringBuilder builder = new StringBuilder();
            for (Character character : characters) {
                builder.append(character);
            }
            set.add(new String(builder));
            return;
        }
        for (int i = 0; i < chars.length; i++) {
            if (marks[i] == 1) {
                continue;
            }
            stack.push(chars[i]);
            marks[i] = 1;
            length++;
            permutationHelper();
            length--;
            marks[i] = 0;
            stack.pop();
        }
    }
}