package DSA_180.recursion_and_backtracking.backtracking;

public class Sudokusolver {
    public static void main(String[] args) {
        
    }

    public  boolean solve(char[][] board) {
        // Find an empty cell
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {

                if (board[row][col] == '.') {

                    // Try digits 1 to 9
                    for (char num = '1'; num <= '9'; num++) {

                        if (isValid(board, row, col, num)) {

                            // Place the number
                            board[row][col] = num;

                            // Recursively solve
                            if (solve(board)) {
                                return true;
                            }

                            // Backtrack: undo the choice
                            board[row][col] = '.';
                        }
                    }

                    // No number is valid
                    return false;
                }
            }
        }

        // No empty cells left: Sudoku solved
        return true;
    }

    public boolean isValid(char[][] board,int row,int col,char num) {
        for (int i = 0; i < 9; i++) {

            // Check row
            if (board[row][i] == num) {
                return false;
            }

            // Check column
            if (board[i][col] == num) {
                return false;
            }

            // Check 3x3 box
            int boxRow = 3 * (row / 3) + i / 3;
            int boxCol = 3 * (col / 3) + i % 3;

            if (board[boxRow][boxCol] == num) {
                return false;
            }
        }

        return true;
    }
}
