package code;

import node.TreeNode;

/**
 * @Author K
 * @Description 剑指 Offer 68 - I. 二叉搜索树的最近公共祖先
 * @Mark
 * @Date 2022/2/3 20:46
 * @EndTime 20.56
 **/
public class JZ68 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (p.val > q.val) {
            return lowestCommonAncestor(root, q, p);
        }
        if ((p.val < root.val && q.val > root.val) || root.val == p.val || root.val == q.val) {
            return root;
        }
        if (p.val > root.val) {
            return lowestCommonAncestor(root.right, p, q);
        }
        return lowestCommonAncestor(root.left, p, q);
    }
}