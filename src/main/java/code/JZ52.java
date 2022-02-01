package code;

/**
 * @Author Jingyu Liu
 * @Description 剑指 Offer 52. 两个链表的第一个公共节点
 * @Date 2022/2/1 18:54
 * @EndTime 19.09
 **/
public class JZ52 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        ListNode tempA = headA;
        ListNode tempB = headB;
        int addTimes = 0;
        while (tempA != tempB) {
            if (tempA.next == null) {
                addTimes++;
                tempA = headB;
            } else{
                tempA = tempA.next;
            }
            if (tempB.next == null) {
                addTimes++;
                tempB = headA;
            } else{
                tempB = tempB.next;
            }
            if(addTimes>2){
                return null;
            }
        }
        return tempA;
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