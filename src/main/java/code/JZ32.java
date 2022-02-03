package code;

import node.TreeNode;

import java.util.*;

/**
 * @Author K
 * @Description 面试题32 - I. 从上到下打印二叉树
 * @Mark
 * @Date 2022/2/3 20:23
 * @EndTime 20.29
 **/
public class JZ32 {
    public int[] levelOrder(TreeNode root) {
        List<Integer> resList = new ArrayList<>();
        if (root == null) {
            return new int[0];
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int count = 0;
        while (!queue.isEmpty()) {
            count = queue.size();
            while (count != 0) {
                TreeNode node = queue.poll();
                count--;
                resList.add(node.val);
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
        }
        int[] res = new int[resList.size()];
        for (int i = 0; i < resList.size(); i++) {
            res[i] = resList.get(i);
        }
        return res;
    }
}