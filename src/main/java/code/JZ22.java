package code;

/**
 * @Author Jingyu Liu
 * @Description 剑指 Offer 22. 链表中倒数第k个节点
 * @Date 2022/2/1 18:35
 * @EndTime
 **/
public class JZ22 {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode left = head;
        ListNode right = head;
        while (k-- > 0) {
            right = right.next;
        }
        while (right != null) {
            right = right.next;
            left = left.next;
        }
        return left;
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