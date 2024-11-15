public class CountingSort {
    // Counting Sort 
    // Works best for sorting integers in a small range.


//     Complexity Analysis:
// Time Complexity:

// Finding maximum value: O(n)
// Populating the count array: O(n)
// Reconstructing sorted array: O(n + k), where k is the range of input.
// Overall: O(n + k)

// Space Complexity:
// Count array takes O(k) space.
// Overall: O(k)

    public static void countingSort(int[] arr) {
        int n = arr.length;
        // Step 1: Find the maximum value in the array
        int largest = Integer.MIN_VALUE;
        for (int i = 1; i < n; i++) {
            largest = Math.max(largest, arr[i]);
        }

        // Step 2: Initialize the count array
        int count[] = new int[largest + 1];
        // Step 3: Populate the count array
        for (int i = 0; i < count.length; i++) {
            count[arr[i]]++;
        }

        // Step 4: Reconstruct the sorted array
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j++] = i;
                count[i]--;
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
        int count[] = { 1, 4, 1, 3, 2, 4, 3, 7 };
        printArray(count);
        countingSort(count);
        printArray(count);
    }
}
