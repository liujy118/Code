package code;

/**
 * @Author Jingyu Liu
 * @Description 剑指 Offer 25. 合并两个排序的链表
 * @Mark
 * @Date 2022/2/2 10:07
 * @EndTime 10.14
 **/
public class JZ25 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode node = head;
        while (l1 != null && l2 != null) {
            if (l1.val > l2.val) {
                node.next = l2;
                node = node.next;
                l2 = l2.next;
            } else {
                node.next = l1;
                node = node.next;
                l1 = l1.next;
            }
        }
        if (l1 == null && l2 == null) {
            return head.next;
        }
        if (l1 == null) {
            node.next = l2;
        }
        if (l2 == null) {
            node.next = l1;
        }
        return head.next;

    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}