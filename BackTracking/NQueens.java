// Question : N - Queens :- Place N-Queens on an N x N Chess board such that no 2 queen can attack each other.

public class NQueens {

    // Time Complexity : O(n!)
    // Recurrence Relation Time Complexity : T(n) = n * T(n - 1) + isSafe()

    // Count Way 
    static int count = 0;
    public static void nQueens(char[][] board, int row) {
        //Base Case
        if (row == board.length) {
            printChessboard(board);
            count++;
            return;
        }
        // column wise loop
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                nQueens(board, row + 1); // Function call
                board[row][j] = 'X'; // Backtracking step
            }
        }
    }
    
    public static boolean isSafe(char[][] board, int row, int col) {
        // Vertical Up
        for (int i = row-1; i>=0; i--) {
            if(board[i][col]=='Q'){
                return false;
            }
        }
        // Diagonal Left
        for(int i= row-1, j = col-1; i>=0 && j>=0; i--, j--) {
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        // Diagonal Right
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }
    public static void printChessboard(char[][] board) {
        System.out.println("---------Chessboard---------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 4;
        char board[][] = new char[n][n];
        // Initialize Chessboard
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'X';
            }
        }

        nQueens(board, 0);
        System.out.println("Total Way : " + count);
    }
}