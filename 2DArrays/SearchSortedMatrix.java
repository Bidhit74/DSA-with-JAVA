public class SearchSortedMatrix {
    // Search Sorted Matrix (Matrix Sorted in rows and columns order both)

    // Time Complexity : O(n+m)
    // This approach is used last column
    /* 
    public static boolean staircaseSearch(int[][] matrix, int key) {
        int rows = 0, cols = matrix[0].length - 1;
        while (rows < matrix.length && cols >= 0) {
            if (matrix[rows][cols] == key) {
                System.out.println("Found key position - ( " + rows + ", " + cols + " )");
                return true;
            }
            // Left traversal case
            else if (matrix[rows][cols] > key) {
                cols--;
            }
            // Bottom traversal case
            else {
                rows++;
            }
        }
        System.out.println("Key not found.");
        return false;
    }
    */
    
    // Time Complexity : O(n+m)
    // This approach is used last column
    public static boolean staircaseSearch(int[][] matrix, int key) {
        int rows = matrix.length-1, cols = 0;
        while (cols < matrix.length && rows >= 0) {
            if (matrix[rows][cols] == key) {
                System.out.println("Found key position - ( " + rows + ", " + cols + " )");
                return true;
            }
            // Top traversal case
            else if (matrix[rows][cols] > key) {
                rows--;
            }
            // Right traversal case
            else {
                cols++;
            }
        }
        System.out.println("Key not found.");
        return false;
    }
    public static void main(String[] args) {
        int[][] Matrix = { { 10, 20, 30, 40 },
                            { 15, 25, 35, 45 },
                            { 27, 29, 37, 48 },
                            { 32, 33, 39, 50 }
        };
                            
        int key = 36;
        staircaseSearch(Matrix, key);
    }
}
