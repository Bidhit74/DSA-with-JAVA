import java.util.Scanner;

public class SearchArray {
    // Searching 2D Array
    public static boolean searchArray(int[][] matrix, int key) {
        int row = matrix.length, col = matrix[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == key) {
                    //found key
                    return true;
                }
            }
        }
        //not found
        return false;
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

        int key = 6;
        if (searchArray(matrix, key)) {
            System.out.println("In Matrix :  " + key + " Available");
        }
        else {
            System.out.println("In Matrix :  " + key + "  not Available");
        }
    }
}
