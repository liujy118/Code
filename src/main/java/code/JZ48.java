package code;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 * @Author Jingyu Liu
 * @Description 剑指 Offer 48. 最长不含重复字符的子字符串
 * @Mark
 * @Date 2022/2/1 23:33
 * @EndTime
 **/
public class JZ48 {
    private final Set<Character> set = new HashSet<>();
    private final Queue<Character> queue = new LinkedList<>();
    private int maxLength = 0;
    public int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (!set.contains(chars[i])){
                set.add(chars[i]);
                queue.offer(chars[i]);
            }else {
                maxLength = Math.max(maxLength,set.size());
                for (;;){
                    Character c = queue.poll();
                    set.remove(c);
                    if (c==chars[i]){
                        set.add(chars[i]);
                        queue.offer(chars[i]);
                        break;
                    }
                }
            }
        }
        maxLength = Math.max(maxLength,set.size());
        return maxLength;
    }
}