package code;

/**
 * 二位数组中的查找
 */
public class JZ04 {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        return findNumberIn2DHelper(matrix, 0, matrix[0].length - 1, target);
    }

    public boolean findNumberIn2DHelper(int[][] matrix, int x, int y, int target) {
        if (matrix[x][y] == target) {
            return true;
        }
        int xLength = matrix.length;

        if (x != xLength - 1 && matrix[x][y] < target) {
            return findNumberIn2DHelper(matrix, x +1, y, target);
        }
        if (y != 0 && matrix[x][y] > target) {
            return findNumberIn2DHelper(matrix, x, y-1, target);
        }
        return false;
    }
}
