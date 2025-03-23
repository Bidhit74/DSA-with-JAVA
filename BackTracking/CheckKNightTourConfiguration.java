// There is a knight on an n x n chessboard. In a valid configuration, the knight starts at the top-left cell of the board and visits every cell on the board exactly once.

// You are given an n x n integer matrix grid consisting of distinct integers from the range [0, n * n - 1] where grid[row][col] indicates that the cell (row, col) is the grid[row][col]th cell that the knight visited. The moves are 0-indexed.

// Return true if grid represents a valid configuration of the knight's movements or false otherwise.


public class CheckKNightTourConfiguration {

    public static boolean helper(int[][] grid, int row, int col, int num){
        int n = grid.length;
        // Base Case
        if(n*n-1 == grid[row][col]){
            return true;
        }
        int i , j;
        // 2 up 1 left
        i = row-2;
        j = col-1;
        if(i>=0 && j>=0 && grid[i][j]==num+1) return helper(grid,i,j,num+1);
        // 2 up 1 right
        i = row-2;
        j = col+1;
        if(i>=0 && j<n && grid[i][j]==num+1) return helper(grid,i,j,num+1);
       // 2 Down 1 left
        i = row+2;
        j = col-1;
        if(i<n && j>=0 && grid[i][j]==num+1) return helper(grid,i,j,num+1);
        // 2 Down 1 right
        i = row+2;
        j = col+1;
        if(i<n && j<n && grid[i][j]==num+1) return helper(grid,i,j,num+1);
        // 2 Left 1 Down
        i = row+1;
        j = col-2;
        if(i<n && j>=0 && grid[i][j]==num+1) return helper(grid,i,j,num+1);
        // 2 Left 1 Up
        i = row-1;
        j = col-2;
        if(i>=0 && j>=0 && grid[i][j]==num+1) return helper(grid,i,j,num+1);
        // 2 Right 1 Down
        i = row+1;
        j = col+2;
        if(i<n && j<n && grid[i][j]==num+1) return helper(grid,i,j,num+1);
        // 2 Right 1 Up
        i = row-1;
        j = col+2;
        if(i>=0 && j<n && grid[i][j]==num+1) return helper(grid,i,j,num+1);

        return false;
    }
    public static boolean checkValidGrid(int[][] grid) {
        if(grid[0][0]!=0) return false;
        return helper(grid,0,0,0);
    }

    public static void main(String[] args) {
        int[][] grid = { { 0, 11, 16, 5, 20 }, { 17, 4, 19, 10, 15 }, { 12, 1, 8, 21, 6 }, { 3, 18, 23, 14, 9 },
                { 24, 13, 2, 7, 22 } };
        System.out.println(checkValidGrid(grid));
    }
}
