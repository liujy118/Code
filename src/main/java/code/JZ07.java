package code;

/**
 * @Author Jingyu Liu
 * @Description 剑指 Offer 07. 重建二叉树
 * @Mark 中途改了i的意义，有的地方又没改，导致时间太长
 * @Date 2022/2/2 9:10
 * @EndTime 10.05
 **/
public class JZ07 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildTreeHelper(preorder, inorder, 0, preorder.length - 1, 0, inorder.length - 1);
    }

    public TreeNode buildTreeHelper(int[] preorder, int[] inorder, int pLeft, int pRight, int iLeft, int iRight) {
        if (pLeft > pRight) {
            return null;
        }
        int rootValue = preorder[pLeft];
        TreeNode root = new TreeNode(rootValue);
        int i = 0;
        for (; i + iLeft <= iRight; i++) {
            if (inorder[i + iLeft] == rootValue) {
                break;
            }
        }
        if (pLeft + 1 < preorder.length) {
            root.left = buildTreeHelper(preorder, inorder, pLeft + 1, pLeft + i, iLeft, i + iLeft - 1);
        }
        if (pLeft + i + 1 < preorder.length) {
            root.right = buildTreeHelper(preorder, inorder, pLeft + 1 + i, pRight, i + iLeft + 1, iRight);
        }
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