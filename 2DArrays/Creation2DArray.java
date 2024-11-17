import java.util.Scanner;

public class Creation2DArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int matrix[][] = new int[3][3];
        int row = matrix.length, col = matrix[0].length;

        //Input matrix
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = s.nextInt();
            }
        }

        //Output Matrix 
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        s.close();
    }
}
