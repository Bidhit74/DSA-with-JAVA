// Question : Grid Ways
// Find number of ways to reach from (0,0) to (n-1, m-1) in a N x M grid. 
// Allowed moves - right or down

public class GridWays {
    // Time Complexity : O(2^n+m) : Exponential Time
    public static int getGridWays(int row, int col, int n, int m) {
        // Base Case
        if (row == n - 1 && col == m - 1) {
            return 1;
        } else if (row == n || col == m) {
            return 0;
        }
        int w1 = getGridWays(row + 1, col, n, m);
        int w2 = getGridWays(row, col + 1, n, m);
        return w1 + w2;
    }
    
    // Using mathematics formula 
    // Ways = (n+m-2)! / (n-1)! (m-1)!
    // Leaner Complexity = O(n) 
    public static int gridWays(int n, int m) {
        int N = n + m - 2; // Total Moves
        int r = Math.min((n - 1), (m - 1)); // Choose the smaller value for efficiency
        long result = 1;

        for (int i = 1; i <= r; i++) {
            result = result * (N - i + 1) / i;
        }
        return (int)result;
        
    }

    public static void main(String[] args) {
        int n = 4, m = 5;
        System.out.println(getGridWays(0, 0, n, m));
        System.out.println(gridWays(n, m));
        
    }
    
}
