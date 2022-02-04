package code;

import node.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author K
 * @Description 剑指 Offer 37. 序列化二叉树
 * @Mark
 * @Date 2022/2/4 12:31
 * @EndTime 12.51
 **/
public class JZ37 {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null) {
            return "[]";
        }
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node != null) {
                builder.append(node.val).append(",");
                queue.add(node.left);
                queue.add(node.right);
            } else {
                builder.append("null").append(",");
            }
        }
        builder.deleteCharAt(builder.length() - 1);
        builder.append("]");
        return new String(builder);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if ("[]".equals(data)) {
            return null;
        }
        String[] strArr = data.substring(1, data.length() - 1).split(",");
        Queue<TreeNode> queue = new LinkedList<>();
        int i = 1;
        TreeNode root = new TreeNode(Integer.parseInt(strArr[0]));
        queue.offer(root);
        while (i < strArr.length) {
            TreeNode node = queue.poll();
            if (!"null".equals(strArr[i])) {
                TreeNode newLeftNode = new TreeNode(Integer.parseInt(strArr[i]));
                node.left = newLeftNode;
                queue.offer(newLeftNode);
            }
            i++;
            if (!"null".equals(strArr[i])) {
                TreeNode newRightNode = new TreeNode(Integer.parseInt(strArr[i]));
                node.right = newRightNode;
                queue.offer(newRightNode);
            }
            i++;
        }
        return root;
    }
}