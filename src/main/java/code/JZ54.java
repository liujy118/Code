package code;

import node.TreeNode;

/**
 * @Author K
 * @Description 剑指 Offer 54. 二叉搜索树的第k大节点
 * @Mark 递归要注意用全局类变量啊
 * @Date 2022/2/3 10:26
 * @EndTime 10.47
 **/
public class JZ54 {
    int n;
    int res;

    public int kthLargest(TreeNode root, int k) {
        n = k;
        dfs(root);
        return res;
    }

    public void dfs(TreeNode root) {
        if (root == null) {
            return;
        }
        dfs(root.right);
        n--;
        if (n == 0) {
            res = root.val;
            return;
        }
        dfs(root.left);
    }
}