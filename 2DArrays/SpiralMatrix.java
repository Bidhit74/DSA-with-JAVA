import java.util.Scanner;

public class SpiralMatrix {
    // Spiral matrix (Question Ask in MAAOG(Microsoft,Amazon,Apple,Oracle,Google))
    //  1  2  3  4  5
    //  6  7  8  9 10
    // 11 12 13 14 15
    // 16 17 18 19 20
    // 21 22 23 24 25 

    // Output :- 1 2 3 4 5 10 15 20 25 24 23 22 21 16 11 6 7 8 9 14 19 18 17 12 13

    // Time Complexity :- O(n*m)  and space complexity : - O(n*m)
    /*
    public static int[] spiralMatrix(int[][] matrix) {
        int rows = matrix.length, cols = matrix[0].length;
        int[] spiral_Matrix = new int[rows * cols];
        int index = 0;
        int rowStart = 0;
        int rowEnd = rows - 1;
        int colStart = 0;
        int colEnd = cols - 1;
    
        while (rowStart <= rowEnd && colStart <= colEnd) {
            // Top Border
            for (int col = rowStart; col <= colEnd; col++) {
                spiral_Matrix[index] = matrix[rowStart][col];
                index++;
            }
            //Right Border
            for (int row = rowStart + 1; row <= rowEnd; row++) {
                spiral_Matrix[index] = matrix[row][colEnd];
                index++;
            }
            //Bottom Border
            for (int col = colEnd - 1; col >= colStart; col--) {
                if (rowStart == rowEnd)
                    break;
                spiral_Matrix[index] = matrix[rowEnd][col];
                index++;
            }
            //Left Border
            for (int row = rowEnd - 1; row >= rowStart + 1; row--) {
                if (rowStart == rowEnd)
                    break;
                spiral_Matrix[index] = matrix[row][colStart];
                index++;
            }
    
            rowStart++;
            rowEnd--;
            colStart++;
            colEnd--;
        }
        return spiral_Matrix;
    }
     */
    // Time Complexity :- O(n*m)  and space complexity : - O(n*m)
    // Better code for readability and Comments
    public static int[] spiralMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[] result = new int[rows * cols];
        int index = 0;
    
        int rowStart = 0, rowEnd = rows - 1;
        int colStart = 0, colEnd = cols - 1;
    
        while (rowStart <= rowEnd && colStart <= colEnd) {
            // Traverse top row
            for (int col = colStart; col <= colEnd; col++) {
                result[index++] = matrix[rowStart][col];
            }
            rowStart++;
    
            // Traverse right column
            for (int row = rowStart; row <= rowEnd; row++) {
                result[index++] = matrix[row][colEnd];
            }
            colEnd--;
    
            // Traverse bottom row (if still within bounds)
            if (rowStart <= rowEnd) {
                for (int col = colEnd; col >= colStart; col--) {
                    result[index++] = matrix[rowEnd][col];
                }
                rowEnd--;
            }
    
            // Traverse left column (if still within bounds)
            if (colStart <= colEnd) {
                for (int row = rowEnd; row >= rowStart; row--) {
                    result[index++] = matrix[row][colStart];
                }
                colStart++;
            }
        }
        return result;
    }
    
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
        int matrix[][] = new int[5][5];
        System.out.println("Enter the matrix 5*5 number :- ");
        inputMatrix(matrix);
        printMatrix(matrix);
        System.out.print("Spiral Matrix :- ");
        int spiral_Matrix[] = spiralMatrix(matrix);
        for (int i = 0; i < spiral_Matrix.length; i++) {
            System.out.print(spiral_Matrix[i] + " ");
        }
    }
}
