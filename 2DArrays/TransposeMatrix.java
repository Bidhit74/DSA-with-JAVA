public class TransposeMatrix {
    // Question :- Write a program to find Transpose of a matrix.
    // Matrix 
    // a11 a12 a13
    // a21 a22 a23
    // Transpose Matrix
    // a11 a21
    // a12 a22
    // a13 a23

    // Time Complexity : O(n * m)  and Space Complexity : O(m * n)
    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length, cols = matrix[0].length;
        int[][] transpose = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }

    // Time Complexity : O(n^2)  and Space Complexity : O(1)
    // Must be square Matrix
    public static int[][] transposeNoExtraSpaceMatrix(int[][] matrix) {
        int rows = matrix.length, cols = matrix[0].length;
        if (rows != cols) {
            throw new IllegalArgumentException("Matrix must be square for in-place transposition.");
        }
        for (int i = 0; i < rows; i++) {
            for (int j = i + 1; j < cols; j++) {
                // Swap elements
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        return matrix;
    }
    public static void printMatrix(int[][] matrix) {
        int row = matrix.length, col = matrix[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 7 }, { 2, 8, 7 }};
        printMatrix(matrix);
        System.out.println("Transpose matrix");
        printMatrix(transposeMatrix(matrix));
        transposeNoExtraSpaceMatrix(matrix);
        System.out.println("Transpose with not use extra space matrix");
        printMatrix(matrix);
    }
}
