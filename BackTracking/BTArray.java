public class BTArray {
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Timr and Space complexity : O(n)
    public static void btArray(int[] arr, int i, int val) {
        // Base case
        if (i == arr.length) {
            printArray(arr);
            return;
        }
        // recursion
        arr[i] = val;
        btArray(arr, i+1, val+1); // recursion function
        arr[i] = arr[i] - 2; // backtracking step
    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        btArray(arr, 0, 1);
        printArray(arr);
    }
}