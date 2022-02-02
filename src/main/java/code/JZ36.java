package code;

/**
 * @Author Jingyu Liu
 * @Description 剑指 Offer 36. 二叉搜索树与双向链表
 * @Mark 闹心哦，left和right反了，耽误了好久
 * @Date 2022/2/2 16:58
 * @EndTime 17.39
 **/
public class JZ36 {

    Node node;
    Node head;

    public Node treeToDoublyList(Node root) {
        if (root == null) {
            return root;
        }
        treeToDoublyListHelper(root);
        node.right = head;
        head.left = node;
        while (head != node) {
            head.right.left = head;
            head = head.right;
        }
        return node;
    }


    public void treeToDoublyListHelper(Node root) {
        if (root == null) {
            return;
        }

        treeToDoublyListHelper(root.left);
        if (node == null) {
            node = root;
            head = root;
        } else {
            node.right = root;
            node = root;
        }
        treeToDoublyListHelper(root.right);
    }

    class Node {
        public int val;
        public Node left;
        public Node right;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right) {
            val = _val;
            left = _left;
            right = _right;
        }
    }

    ;
}