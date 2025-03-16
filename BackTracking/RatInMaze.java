//Question 1 : Rat in a Maze
//  You are given a starting position for a rat which is stuck in a maze at an initial point (0, 0) (the maze can be thought of as a 2-dimensional plane). The maze would be given in the form of a square matrix of order N * N where the cells with value 0 represent the maze’s blocked locations while value 1 is the open/available path that the rat can take to reach its destination.
//  The rat's destination is at (N - 1, N - 1).
//  Your task is to find all the possible paths that the rat can take to reach from source to destination in the maze.
//     The possible directions that it can take to move in the maze are 'U'(up) i.e. (x, y- 1) , 'D'(down) i.e. (x, y + 1) , 'L' (left) i.e. (x - 1, y), 'R' (right) i.e. (x + 1, y).

//Sample Input : 
// int maze[][] = 
// { { 1, 0, 0, 0 },
//  { 1, 1, 0, 1 },
//  { 1, 1, 0, 0 },
//  { 0, 1, 1, 1 } };

//  Sample Output : "DRDDRR", "DDRDRR" 


public class RatInMaze {

    // Time Complexity : O(4^n^2) : Exponential time complexity
    // Space Complexity : O(n^2) 
    public static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void solveRatMaze(int[][] maze, int row, int col, int n, String path) {
        // Base case
        if (row == n - 1 && col == n - 1) {
            System.out.println(path);
            // printArray(maze);
            return;
        }
        // Check boundaries and if path is open
        if (row >= 0 && row < n && col >= 0 && col < n && maze[row][col] == 1) {
            maze[row][col] = 0; // Mark as visited
    
            // Move Right "R"
            solveRatMaze(maze, row, col + 1, n, path + "R");
            // Move Left "L"
            solveRatMaze(maze, row, col - 1, n, path + "L");
            // Move Down "D"
            solveRatMaze(maze, row + 1, col, n, path + "D");
            // Move Up "U"
            solveRatMaze(maze, row - 1, col, n, path + "U");
    
            maze[row][col] = 1; // Backtrack
        }
    }
    
    public static void main(String[] args) {
        int maze[][] = 
        {   { 1, 0, 0, 0 },
            { 1, 1, 0, 1 },
            { 1, 1, 0, 0 },
            { 0, 1, 1, 1 }
                };
        
        if (maze[0][0] == 1) {
            solveRatMaze(maze, 0, 0, 4, "");
        } else {
            System.out.println("Solution not possible");
        }

    }
}
