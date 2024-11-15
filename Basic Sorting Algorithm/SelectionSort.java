public class SelectionSort {
    // Slection sort :- Pick the smallest (from unsorted) put it at the beginning.

    //Time Complexity O(n^2)
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i; // Assume the current element is the smallest
            // Find the index of the smallest element in the unsorted part
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            } 
            // Swap the smallest element with the current element
            if (minIndex != i) { // Avoid unnecessary swaps
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.err.println();
    }
    public static void main(String[] args) {
        int arr[] = { 4, 2, 1, 3, 5 };
        printArray(arr);
        selectionSort(arr);
        printArray(arr);
    }
}
