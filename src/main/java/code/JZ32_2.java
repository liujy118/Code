package code;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @Author Jingyu Liu
 * @Description 剑指 Offer 32 - II. 从上到下打印二叉树 II
 * @Mark
 * @Date 2022/2/2 16:46
 * @EndTime 16.53
 **/
public class JZ32_2 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int count = 0;
        while (!queue.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            count = queue.size();
            while (count != 0) {
                TreeNode node = queue.poll();
                count--;
                list.add(node.val);
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            res.add(list);
        }
        return res;
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