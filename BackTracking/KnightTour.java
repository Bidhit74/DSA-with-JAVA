// Knight’s Tour
// Given a N*N board with the Knight placed on the first block of an empty board. Moving according to the rules of chess, knights must visit each square exactly once. Print the order of each cell in which they are visited.

// Sample Input 1 : N = 8
//  Sample Output 1 :
//  0  59  38  33  30  17   8  63
//  37  34  31  60   9  62  29  16
//  58   1  36  39  32  27  18   7
//  35  48  41  26  61  10  15  28
//  42  57   2  49  40  23   6  19
//  47  50  45  54  25  20  11  14
//  56  43  52   3  22  13  24   5
//  51  46  55  44  53   4  21  12

public class KnightTour {

    static int[] rowMoves = {-2, -1, 1, 2, 2, 1, -1, -2};
    static int[] colMoves = {1, 2, 2, 1, -1, -2, -2, -1};
    public static boolean isSafe(int[][] knights, int row, int col) {
        int n = knights.length;
        if (row >= 0 && col >= 0 && row < n && col < n && knights[row][col] == -1) {
            return true;
        }
        return false;
    }

    public static boolean knightTour(int[][] knights, int row, int col, int num) {
        int n = knights.length;
        if (n * n == num) {
            return true;
        }
        for (int k = 0; k < n; k++) {
            int newRow = row + rowMoves[k];
            int newCol = col + colMoves[k];
            if (isSafe(knights, newRow, newCol)) {
                knights[newRow][newCol] = num;
                if (knightTour(knights, newRow, newCol, num + 1)) {
                    return true;
                }
                // Backtracking
                knights[newRow][newCol] = -1;
            }
        }

        return false;
    }

    public static void printArray(int[][] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void knightTourPrint(int n) {
        int[][] knights = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                knights[i][j] = -1;
            }
        }
        knights[0][0] = 0;
        if (knightTour(knights, 0, 0, 1)) {
            printArray(knights);
        } else {
            System.out.println("Solution does not exist");
        }
    }
    public static void main(String[] args) {
        knightTourPrint(8);
    }
}