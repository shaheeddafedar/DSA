package DSA_180.recursion_and_backtracking.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class n_queen {
    public static void main(String[] args) {
        
    }
     public List<List<String>> solveNQueens(int n) {

        List<List<String>> ans = new ArrayList<>();

        char[][] board = new char[n][n];

        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }

        nqueen(board, 0, n, ans, new ArrayList<>());

        return ans;
    }

    public void nqueen(char[][] board, int row, int n,
                       List<List<String>> result,
                       List<String> list) {

        if (row == n) {

            result.add(new ArrayList<>(list));
            return;
        }

        for (int col = 0; col < n; col++) {

            if (isSafe(board, row, col, n)) {

                board[row][col] = 'Q';

                list.add(new String(board[row]));

                nqueen(board, row + 1, n, result, list);

                list.remove(list.size() - 1);

                board[row][col] = '.';
            }
        }
    }

    public boolean isSafe(char[][] board, int row,
                          int col, int n) {

        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q')
                return false;
        }

        for (int i = row - 1, j = col - 1;
             i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q')
                return false;
        }

        for (int i = row - 1, j = col + 1;
             i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 'Q')
                return false;
        }

        return true;
    }
}
// Time O(N!)
// space O(N^2)