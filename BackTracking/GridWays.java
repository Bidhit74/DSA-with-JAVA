// Question : Grid Ways
// Find number of ways to reach from (0,0) to (n-1, m-1) in a N x M grid. 
// Allowed moves - right or down

public class GridWays {

    // Time Complexity : O(2^n+m)
    public static int getGridWays(int row, int col, int n, int m) {
        // Base Case
        if (row == n - 1 && col == m - 1) {
            return 1;
        }
        else if (row == n || col == m) {
            return 0;
        }

        int w1 = getGridWays(row + 1, col, n, m);
        int w2 = getGridWays(row, col + 1, n, m);
        return w1 + w2;
    }
    public static void main(String[] args) {
        int n = 10, m = 3;
        System.out.println(getGridWays(0,0, n, m));
    }
    
}
