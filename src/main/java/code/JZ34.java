package code;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @Author Jingyu Liu
 * @Description 剑指 Offer 34. 二叉树中和为某一值的路径
 * @Mark
 * @Date 2022/2/1 22:55
 * @EndTime 23.03
 **/
public class JZ34 {

    private Stack<Integer> stack = new Stack<>();
    private int sum = 0;
    private List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int target) {
        if (root == null) {
            return res;
        }
        sum += root.val;
        stack.push(root.val);
        if (root.left == null && root.right == null && sum == target) {
            res.add(new ArrayList<>(stack));
        }
        if (root.left != null) {
            pathSum(root.left, target);
        }
        if (root.right != null) {
            pathSum(root.right, target);
        }
        sum -= root.val;
        stack.pop();
        return res;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}