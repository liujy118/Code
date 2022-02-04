package node;

/**
 * @Author K
 * @Description
 * @Mark
 * @Date 2022/2/4 15:27
 * @EndTime
 **/
public class ListNode {
    public int val;
    public ListNode next;

    ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}