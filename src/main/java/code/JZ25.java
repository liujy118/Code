package code;

import java.util.Stack;

/**
 * @Author Jingyu Liu
 * @Description 25. K 个一组翻转链表
 * @Date 2022/2/1 18:01
 * @EndTime 18.26
 **/
public class JZ25 {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (k == 1) {
            return head;
        }
        Stack<ListNode> stack = new Stack<>();
        stack.push(head);
        int i = k;
        while (i > 1 && stack.peek() != null) {
            i--;
            if (stack.peek().next != null) {
                stack.push(stack.peek().next);
            }
        }
        if (stack.size() != k) {
            return head;
        }
        ListNode newHead = stack.peek();
        ListNode nextHead = newHead.next;
        ListNode node = stack.pop();
        while (!stack.isEmpty()) {
            node.next = stack.peek();
            node = stack.pop();
        }
        node.next = reverseKGroup(nextHead, k);
        return newHead;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}