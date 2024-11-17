import java.util.Scanner;

public class FindSmallestLargest {
    // Find the smallest and largest Value

    public static int findSmallest(int[][] matrix) {
        int rows = matrix.length, cols = matrix[0].length;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (smallest > matrix[i][j]) {
                    smallest = matrix[i][j];
                }
            }
        }
        return smallest;
    }
    public static int findLargest(int[][] matrix) {
        int rows = matrix.length, cols = matrix[0].length;
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (largest < matrix[i][j]) {
                    largest = matrix[i][j];
                }
            }
        }
        return largest;
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
        int matrix[][] = new int[3][3];
        System.out.println("Enter the matrix 3*3 number :- ");
        inputMatrix(matrix);
        printMatrix(matrix);
        System.out.println("Largest in Matrix : " + findLargest(matrix));
        System.out.println("Smallest in Matrix : " + findSmallest(matrix));
    }
}
