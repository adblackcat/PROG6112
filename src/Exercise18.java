public class Exercise18 {

    private static final int N = 8; // Size of the chessboard

    //print the chessboard
    private static void printBoard(int[][] board) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (board[i][j] == 1) {
                    System.out.print("Q ");
                } else {
                    System.out.print("_ ");
                }
            }
            System.out.println();
        }
    }

    // check if a queen can be placed on board[row][col]
    private static boolean isSafe(int[][] board, int row, int col) {
        // Check this row on left side
        for (int i = 0; i < col; i++) {
            if (board[row][i] == 1) {
                return false;
            }
        }

        // Check upper diagonal on left side
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        // Check lower diagonal on left side
        for (int i = row, j = col; j >= 0 && i < N; i++, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        return true;
    }

    // solve the Eight Queens problem
    private static boolean solveQueens(int[][] board, int col) {
        // If all queens are placed, return true
        if (col >= N) {
            return true;
        }

        // Consider this column and try placing this queen in all rows one by one
        for (int i = 0; i < N; i++) {
            if (isSafe(board, i, col)) {
                // Place this queen in board[i][col]
                board[i][col] = 1;

                // place the rest of the queens
                if (solveQueens(board, col + 1)) {
                    return true;
                }

                // If placing queen in board[i][col] does not lead to a solution,
                // then remove the queen from board[i][col]
                board[i][col] = 0;
            }
        }

        // If the queen cannot be placed in any row in this column, return false
        return false;
    }

    public static void main(String[] args) {
        int[][] board = new int[N][N];

        // Solve the Eight Queens problem
        if (solveQueens(board, 0)) {
            // Print the solution
            System.out.println("One possible solution is:");
            printBoard(board);
        } else {
            System.out.println("Solution does not exist");
        }
    }
}
