package code;

import java.util.Stack;

/**
 * @Author Jingyu Liu
 * @Description 剑指 Offer 31. 栈的压入、弹出序列
 * @Mark
 * @Date 2022/2/2 20:33
 * @EndTime 20.53
 **/
public class JZ31 {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int pushIndex = 0;
        int popIndex = 0;
        while (popIndex < popped.length) {
            if (pushIndex < pushed.length && pushed[pushIndex] == popped[popIndex]) {
                popIndex++;
                pushIndex++;
            } else {
                if (!stack.isEmpty() && stack.peek() == popped[popIndex]) {
                    popIndex++;
                    stack.pop();
                } else if (stack.isEmpty() || stack.peek() != popped[popIndex] && pushIndex < pushed.length) {
                    stack.push(pushed[pushIndex]);
                    pushIndex++;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}