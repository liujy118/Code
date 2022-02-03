package code;

/**
 * @Author Jingyu Liu
 * @Description 剑指 Offer 55 - I. 二叉树的深度
 * @Mark
 * @Date 2022/2/2 21:23
 * @EndTime 21.25
 **/
public class JZ55 {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
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