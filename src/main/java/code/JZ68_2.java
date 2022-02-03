package code;

import node.TreeNode;

/**
 * @Author K
 * @Description 剑指 Offer 68 - II. 二叉树的最近公共祖先
 * @Mark 最好应该是后序遍历，并且是一趟遍历，懒得敲了，遇到了再说吧
 * @Date 2022/2/3 20:32
 * @EndTime 20.42
 **/
public class JZ68_2 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int leftCount = includeNodeCount(root.left, p, q);
        int rightCount = includeNodeCount(root.right, p, q);
        if ((root == p || root == q) && (leftCount == 1 || rightCount == 1)) {
            return root;
        }
        if (leftCount == 1 && rightCount == 1) {
            return root;
        }
        if (leftCount == 2) {
            return lowestCommonAncestor(root.left, p, q);
        }
        if (rightCount == 2) {
            return lowestCommonAncestor(root.right, p, q);
        }
        return null;
    }

    public int includeNodeCount(TreeNode root, TreeNode... nodes) {
        if (root == null) {
            return 0;
        }
        int count = 0;
        for (TreeNode node : nodes) {
            if (node == root) {
                count++;
            }
        }
        return count + includeNodeCount(root.left, nodes) + includeNodeCount(root.right, nodes);
    }
}