package code;

/**
 * @Author Jingyu Liu
 * @Description 剑指 Offer 12. 矩阵中的路径
 * @Date 2022/2/1 16:58
 * @EndTime 17:27
 **/
public class JZ12 {
    public boolean exist(char[][] board, String word) {
        int xLen = board.length;
        int yLen = board[0].length;
        int[][] mark = new int[xLen][yLen];
        for (int i = 0; i < xLen; i++) {
            for (int j = 0; j < yLen; j++) {
                if (existHelper(board, mark, word.toCharArray(), 0, i, j)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean existHelper(char[][] board, int[][] mark, char[] boardArray, int index, int x, int y) {
        if (board[x][y] != boardArray[index]) {
            return false;
        }
        if (index == boardArray.length - 1) {
            return true;
        }
        int xLen = board.length;
        int yLen = board[0].length;
        mark[x][y] ^= 1;
        boolean exist = false;
        if (x + 1 < xLen && mark[x + 1][y] == 0) {
            index++;
            x++;
            exist = existHelper(board, mark, boardArray, index, x, y);
            index--;
            x--;
        }
        if (exist) {
            return exist;
        }
        if (x - 1 >= 0 && mark[x - 1][y] == 0) {
            index++;
            x--;
            exist = existHelper(board, mark, boardArray, index, x, y) || exist;
            index--;
            x++;
        }
        if (exist) {
            return exist;
        }
        if (y + 1 < yLen && mark[x][y + 1] == 0) {
            index++;
            y++;
            exist = existHelper(board, mark, boardArray, index, x, y) || exist;
            index--;
            y--;
        }
        if (exist) {
            return exist;
        }
        if (y - 1 >= 0 && mark[x][y - 1] == 0) {
            index++;
            y--;
            exist = existHelper(board, mark, boardArray, index, x, y) || exist;
            index--;
            y++;
        }
        mark[x][y] ^= 1;
        return exist;
    }
}