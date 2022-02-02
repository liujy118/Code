package code;

/**
 * @Author Jingyu Liu
 * @Description 剑指 Offer 33. 二叉搜索树的后序遍历序列
 * @Mark 只有第一次大于根节点时才记录index，后边的不更新，code也有数学题的马虎错误啊
 * @Date 2022/2/2 15:27
 * @EndTime 15.50
 **/
public class JZ33 {
    public boolean verifyPostorder(int[] postorder) {
        if (postorder == null || postorder.length == 0) {
            return true;
        }
        return verifyPostorderHelper(postorder, 0, postorder.length - 1);
    }

    public boolean verifyPostorderHelper(int[] postorder, int leftIndex, int rightIndex) {
        if (leftIndex > rightIndex) {
            return true;
        }
        int rootValue = postorder[rightIndex];
        int rightStartIndex = -1;
        for (int i = 0; i + leftIndex <= rightIndex - 1; i++) {
            if (postorder[leftIndex + i] > rootValue && rightStartIndex == -1) {
                rightStartIndex = leftIndex + i;
            }
            if (rightStartIndex != -1 && postorder[leftIndex + i] < rootValue) {
                return false;
            }
        }
        if (rightStartIndex == -1) {
            return verifyPostorderHelper(postorder, leftIndex, rightIndex - 1);
        }
        return verifyPostorderHelper(postorder, leftIndex, rightStartIndex - 1) &&
                verifyPostorderHelper(postorder, rightStartIndex, rightIndex - 1);
    }
}