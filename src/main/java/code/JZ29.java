package code;

/**
 * @Author Jingyu Liu
 * @Description 剑指 Offer 29. 顺时针打印矩阵
 * @Mark
 * @Date 2022/2/2 20:59
 * @EndTime 21.11
 **/
public class JZ29 {
    public int[] spiralOrder(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return new int[0];
        }
        int top = 0;
        int left = 0;
        int bottom = matrix.length - 1;
        int right = matrix[0].length - 1;
        int total = matrix.length * matrix[0].length;
        int[] res = new int[total];
        int index = 0;
        while (index < total) {
            for (int i = left; i <= right; i++) {
                res[index++] = matrix[top][i];
            }
            top++;
            if (index == total) {
                return res;
            }
            for (int i = top; i <= bottom; i++) {
                res[index++] = matrix[i][right];
            }
            right--;
            if (index == total) {
                return res;
            }
            for (int i = right; i >= left; i--) {
                res[index++] = matrix[bottom][i];
            }
            bottom--;
            if (index == total) {
                return res;
            }
            for (int i = bottom; i >= top; i--) {
                res[index++] = matrix[i][left];
            }
            left++;
            if (index == total) {
                return res;
            }
        }
        return res;
    }
}