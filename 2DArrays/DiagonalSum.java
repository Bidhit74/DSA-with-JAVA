import java.util.Scanner;

public class DiagonalSum {
    // Diagonal Sum 
    // Matrices -- n x n 
    // 1  2  3  4
    // 5  6  7  8
    // 9  10 11 12
    // 13 14 15 16

    // Primary Diagonal Sum = 1 + 6 + 11 + 16 =  34
    // secondary Diagonal Sum = 4 + 7 + 10 + 13 = 34
    // Total Diagonal Sum = 34 + 34 = 68

    // Time Complexity : O(n*1) = O(n)
    /* 
    public static int diagonalSum(int[][] matrix) {
        int rows = matrix.length, cols = matrix[0].length;
        int pSum = 0;
        int sSum = 0;
        for (int i = 0; i < rows; i++) {
            //primary diagonal sum 
            for (int j = i; j <= i; j++) {
                pSum += matrix[i][j];
            }
            //primary diagonal sum
            if (i != cols - 1) { // The preventing odd number matrix middle diagonal single count/sum
                sSum += matrix[i][cols - 1];
            }
            cols--;
        }
        System.out.println("primary diagonal sum: " + pSum);
        System.out.println("secondary diagonal sum: " + sSum);
        // total diagonal sum
        int totalSum = pSum + sSum;
        return totalSum;
    }
    */
    // Time Complexity : O(n) :: More Better way code 
    public static int diagonalSum(int[][] matrix) {
        int n = matrix.length;
        int totalSum = 0;
        for (int i = 0; i < n; i++) {
            //primary diagonal sum 
            totalSum += matrix[i][i];
            //secondary diagonal sum
            if (i != n - 1 - i) { // The preventing odd number matrix middle diagonal single count/sum
                totalSum += matrix[i][n - 1 - i];
            }
        }
        return totalSum;
    }
    
    //Input Method
    public static void inputMatrix(int[][] matrix) {
        Scanner s = new Scanner(System.in);
        int row = matrix.length, col = matrix[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = s.nextInt();
            }
        }
        s.close();
    }
    //Output Method
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
        int n = 4;
        int[][] matrix = new int[n][n];
        inputMatrix(matrix);
        printMatrix(matrix);
        System.out.println("Total Diagonal sum:  " + diagonalSum(matrix));
    }
}
