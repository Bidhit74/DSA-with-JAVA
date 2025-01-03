// Problem - Tiling Problem (Ask in Amazon)
// Give a "2 x n" board and tiles of size "2 x 1", count the number of ways to tile the given board using the 2 x 1 tiles. (A tile can either be placed horizontally or vertically)

public class TilingProblem {

    // Time Complexity : O(2^n)
    // Space Complexity : O(n)
    public static int tilingProblem(int n) {
        // Base Case
        if (n == 0 || n == 1) {
            return 1;
        }

        //Choices tiles placed horizontally or vertically.
        // Vertical tiles placed
        int verticalTiles = tilingProblem(n - 1);

        //Horizontal tiles placed
        int horizontalTiles = tilingProblem(n - 2);

        int totalWays = horizontalTiles + verticalTiles;
        return totalWays;
    }
    public static void main(String[] args) {
        System.out.println(tilingProblem(4));
        System.out.println(tilingProblem(6));
    }
}
