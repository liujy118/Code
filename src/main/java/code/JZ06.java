package code;

/**
 * 倒序打印链表
 */
public class JZ06 {
    public int[] reversePrint(ListNode head) {
        int[] arr = null;
        return reverseHelper(head,0,arr);
    }

    public int[] reverseHelper(ListNode head,int arrLength,int[] arr){
        if(head == null){
            return null;
        }
        arr = reverseHelper(head.next,++arrLength,arr);
        if(head.next == null){
            arr = new int[arrLength];
        }
        arr[arr.length-arrLength] = head.val;
        return arr;
    }
    public static class ListNode {
        int val;
        public ListNode next;
        public ListNode(int x) { val = x; }
    }
}