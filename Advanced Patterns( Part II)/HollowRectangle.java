public class HollowRectangle {
    // HOLLOW RECTANGLE pattern
    // * * * * *
    // *       *
    // *       *
    // * * * * *
    public static void hollowRectangle(int rows, int cols) {
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                if (i == 0 || i == cols - 1 || j == 0 || j == rows - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        hollowRectangle(10, 8);
    }
}

