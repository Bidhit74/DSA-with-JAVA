public class CountNumber {
    // Question : print the number of 7's that are in the 2D Array.
    // Example : int[][] arr = {{1,2,7},{2,8,7},{3,4,7}};
    // Output :- 2 

    // Time Complexity : O(n * m)
    public static void printCountNumbers(int[][] arr, int num) {
        int count = 0 , rows = arr.length, cols = arr[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arr[i][j] == num) {
                    count++;
                }
            }
        }
        System.out.println("Total " + num + "'s Persent: " + count);
    }
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 7 }, { 2, 8, 7 }, { 3, 4, 7 } };
        int num = 7;
        printCountNumbers(arr,num);
    }
}
