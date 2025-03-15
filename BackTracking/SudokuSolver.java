// Write a function to complete a Sudoku
public class SudokuSolver {

    // Time Complexity : O(9^n) : exponential time complexity
    // Space Complexity : O(n)
    public static boolean sudokuSolver(int[][] sudoku, int row, int col) {
        // Base case: If we reach row 9, the entire board is filled correctly
        if (row == 9) {
            return true;
        }
    
        // Determine the next cell position
        int nextRow = row, nextCol = col + 1;
        if (col + 1 == 9) { // Move to the next row if we reach the last column
            nextRow = row + 1;
            nextCol = 0;
        }
    
        // If the cell is already filled, move to the next cell
        if (sudoku[row][col] != 0) {
            return sudokuSolver(sudoku, nextRow, nextCol);
        }
    
        // Try placing digits 1-9 in the current empty cell
        for (int digit = 1; digit <= 9; digit++) {
            // Check if it's safe to place the digit
            if (isSafe(sudoku, row, col, digit)) {
                sudoku[row][col] = digit; // Place the digit
                
                // Recursively solve for the next cell
                if (sudokuSolver(sudoku, nextRow, nextCol)) { 
                    return true; // If solution is found, return true
                }
                
                sudoku[row][col] = 0; // Backtrack (reset the cell)
            }
        }
    
        return false; // No valid number found, backtrack
    }
    
    public static boolean isSafe(int[][] sudoku, int row, int col, int digit) {
        // Check if digit exists in the current row
        for (int j = 0; j < 9; j++) {
            if (sudoku[row][j] == digit) {
                return false;
            }
        }
    
        // Check if digit exists in the current column
        for (int i = 0; i < 9; i++) {
            if (sudoku[i][col] == digit) {
                return false;
            }
        }
    
        // Check if digit exists in the 3x3 grid
        int sRow = (row / 3) * 3; // Starting row of the 3x3 grid
        int sCol = (col / 3) * 3; // Starting column of the 3x3 grid
    
        for (int i = sRow; i < sRow + 3; i++) {
            for (int j = sCol; j < sCol + 3; j++) {
                if (sudoku[i][j] == digit) {
                    return false;
                }
            }
        }
    
        return true; // Safe to place the digit
    }
    
    public static void printSudoku(int[][] sudoku) {
        System.out.println("╔═══════╦═══════╦═══════╗");
        for (int i = 0; i < 9; i++) {
            System.out.print("║ ");
            for (int j = 0; j < 9; j++) {
                System.out.print(sudoku[i][j] == 0 ? "- " : sudoku[i][j] + " ");
                if (j == 2 || j == 5) {
                    System.out.print("║ ");
                }
            }
            System.out.println("║");
            if (i == 2 || i == 5) {
                System.out.println("╠═══════╬═══════╬═══════╣");
            }
        }
        System.out.println("╚═══════╩═══════╩═══════╝");
    }
    

    public static void main(String[] args) {
        int[][] sudoku = { { 0, 0, 8, 0, 0, 0, 0, 0, 0 }, { 4, 9, 0, 1, 5, 7, 0, 0, 2 }, { 0, 0, 3, 0, 0, 4, 1, 9, 0 },
                { 1, 8, 5, 0, 6, 0, 0, 2, 0 }, { 0, 0, 0, 0, 2, 0, 0, 6, 0 }, { 9, 6, 0, 4, 0, 5, 3, 0, 0 },
                { 0, 3, 0, 0, 7, 2, 0, 0, 4 }, { 0, 4, 9, 0, 3, 0, 0, 5, 7 }, { 8, 2, 7, 0, 0, 9, 0, 1, 3 } };

        printSudoku(sudoku);

        if (sudokuSolver(sudoku, 0, 0)) {
            System.out.println("Solution exists");
            printSudoku(sudoku);
        } else {
            System.out.println("Solution does not exist");
        }
    }
    
}
