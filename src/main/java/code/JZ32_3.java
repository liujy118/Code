package code;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author Jingyu Liu
 * @Description 剑指 Offer 32 - III. 从上到下打印二叉树 III
 * @Mark 注意插入的时候也要有顺序
 * @Date 2022/2/2 16:41
 * @EndTime /
 **/
public class JZ32_3 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (null == root) {
            return res;
        }
        boolean bool = true;
        int sanCount = 1;
        Deque<TreeNode> deque = new LinkedList<>();
        deque.offer(root);
        while (!deque.isEmpty()) {
            int tempCount = 0;
            List<Integer> rowList = new ArrayList<>();
            while (!deque.isEmpty() && sanCount-- > 0) {
                TreeNode treeNode = this.pollDeque(bool, deque);
                rowList.add(treeNode.val);
                tempCount += this.offerDeque(bool, deque, treeNode);
            }
            res.add(rowList);
            bool = !bool;
            sanCount = tempCount;
        }
        return res;
    }

    private TreeNode pollDeque(boolean bool, Deque<TreeNode> deque) {
        return bool ? deque.pollFirst() : deque.pollLast();
    }

    private int offerDeque(boolean bool, Deque<TreeNode> deque, TreeNode node) {
        int count = 0;
        if (bool) {
            if (node.left != null) {
                deque.offerLast(node.left);
                count++;
            }
            if (node.right != null) {
                deque.offerLast(node.right);
                count++;
            }
        } else {
            if (node.right != null) {
                deque.offerFirst(node.right);
                count++;
            }
            if (node.left != null) {
                deque.offerFirst(node.left);
                count++;
            }
        }
        return count;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}