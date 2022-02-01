package code;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 剑指 Offer 50. 第一个只出现一次的字符
 */
public class JZ50 {
    public char firstUniqChar(String s) {
        Map<Character,Integer> map = new HashMap<>();
        char[] chars = s.toCharArray();
        for (char c : chars) {
            if (map.containsKey(c)){
                map.put(c,map.get(c)+1);
            } else {
                map.put(c,1);
            }
        }
        for (char c : chars) {
            if (map.get(c)==1){
                return c;
            }
        }
        return ' ';
    }
}
