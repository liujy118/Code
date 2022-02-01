package code;

/**
 * @Author Jingyu Liu
 * @Description 剑指 Offer 18. 删除链表的节点
 * @Mark
 * @Date 2022/2/1 22:47
 * @EndTime 22.51 （四分钟）
 **/
public class JZ18 {
    public ListNode deleteNode(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        if (head.val == val) {
            return head.next;
        }
        ListNode node = head;
        while (node != null) {
            if (node.next != null && node.next.val == val) {
                node.next = node.next.next;
                break;
            } else {
                node = node.next;
            }
        }
        return head;
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