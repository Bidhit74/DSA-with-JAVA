// Merge Sort
// Unsorted : [6, 3, 9, 5, 2, 8]
// Solve sorted order : [2, 3, 5, 6, 8, 9]

public class MergeSort {
    // Print array elements
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Merge Sort function
    // Time Complexity: O(n log n) and Space Complexity: O(n)
    //Depth First Structure Use (DFS)
    public static void mergeSort(int[] arr, int start, int end) {
        if (start >= end) return; // Base case
        
        int mid = start + (end - start) / 2;
        mergeSort(arr, start, mid);   // Sort left half
        mergeSort(arr, mid + 1, end); // Sort right half
        merge(arr, start, mid, end);  // Merge sorted halves
    }
/* 
    public static void merge(int arr[], int sIndx, int mid, int eIndx) {
        int[] temp = new int[eIndx - sIndx + 1];
        int i = sIndx; // Iterator index for left side
        int j = mid + 1; // Iterator index for right side  
        int k = 0; // Iterator index for temp array

        while (i <= mid && j <= eIndx) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        // for left over elements of 1st sorted part 
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        // for right over elements of 2nd sorted part
        while (j <= eIndx) {
            temp[k++] = arr[j++];
        }
        // Copy temp array to original array
        for (k = 0, i = sIndx; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }
        */

    // or
    // Merge function
    public static void merge(int[] arr, int start, int mid, int end) {
        int[] temp = new int[end - start + 1];
        int i = start, j = mid + 1, k = 0;
        while (i <= mid && j <= end) {
            temp[k++] = (arr[i] < arr[j]) ? arr[i++] : arr[j++];
        }
        while (i <= mid) temp[k++] = arr[i++]; // Copy remaining left part
        while (j <= end) temp[k++] = arr[j++]; // Copy remaining right part
        System.arraycopy(temp, 0, arr, start, temp.length); // Copy back to original array
    }
    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 5, 2, 8 };
        System.out.print("Unsorted : ");
        printArray(arr);
        mergeSort(arr, 0, arr.length - 1);
        System.out.print("Solve sorted order : ");
        printArray(arr);
    }
}
