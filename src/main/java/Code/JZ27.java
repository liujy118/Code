package Code;

/**
 * 翻转二叉树
 */
public class JZ27 {
    public TreeNode mirrorTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode tempNode = mirrorTree(root.left);
        root.left = mirrorTree(root.right);
        root.right = tempNode;
        return root;
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
