// N-Queens --> print 1 Solution
// Check if problem can be solved & print only one solution to N Queens problem.

public class NQueensOneSolution {

    public static boolean nQueens(char[][] board, int row) {
        //Base Case
        if(board.length==row){
            return true;
        }
        //recursive case
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                if (nQueens(board, row + 1)) {
                    return true;
                }
                board[row][j] = 'x';
            }
        }
        return false;
    }
    
    public static boolean isSafe(char[][] board, int row, int col) {
        //Vertical
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        // Diagonal Right
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        //Diagonal left
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
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
        int n = 3;
        char[][] board = new char[n][n];
        // Initialize Chessboard
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'x';
            }
        }
        if (nQueens(board, 0)) {
            System.out.println("-------- Solution is possible ------- ");
            printChessboard(board);
        }
        else {
            System.out.println("-------- Solution is not possible ------- ");
        }
    }
}
