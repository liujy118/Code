package leetcode;

import node.ListNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author K
 * @Description 23. 合并K个升序链表
 * @Mark 贼鸡巴帅
 * @Date 2022/2/4 15:27
 * @EndTime 5.38
 **/
public class LC23 {
    public ListNode mergeKLists(ListNode[] lists) {
        Queue<ListNode> queue = new LinkedList<>();
        for (int i = 0; i < lists.length; i++) {
            queue.offer(lists[i]);
        }
        while (queue.size() > 1) {
            queue.offer(mergeTwoLists(queue.poll(), queue.poll()));
        }
        return queue.poll();
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;

        }
        if (l2 == null) {
            return l1;
        }
        ListNode head = new ListNode(0);
        ListNode node = head;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                node.next = l1;
                l1 = l1.next;
            } else {
                node.next = l2;
                l2 = l2.next;
            }
            node = node.next;
        }
        if (l1 != null) {
            node.next = l1;
        } else {
            node.next = l2;
        }
        return head.next;
    }
}