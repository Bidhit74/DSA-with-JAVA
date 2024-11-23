public class SumOfMatrixRow {
    // Question :-  Print out the sum of the numbers in the second row of the "nums" 2D Array.
    // int[][] nums = {{1,2,3},{10,11,12},{20,21,22}};
    // Output :- 10 + 11 + 12 = 33   
    
    // Time Complexity : O(n)
    public static void printSumOfMatrixRow(int[][] nums, int rows) {
        int sum = 0 , cols = nums[0].length;
            for (int j = 0; j < cols; j++) {
                sum += nums[rows][j];
            }
        System.out.println("Rows " + rows + "'s total sum : " + sum);
    }
    public static void main(String[] args) {
        int[][] nums = {{1,2,3},{10,11,12},{20,21,22}};
        int rows = 1;
        printSumOfMatrixRow(nums,rows);
    }
}
