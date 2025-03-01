public class QuickSort {
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    

    //? (Best and Average Case) --> Time Complexity: O(n log n) and Space Complexity: O(log n)
    //? (Wrost Case) --> Time Complexity: O(n^2) and Space Complexity: O(n)
    //? Wrost case occurs when pivot is always the smallest or largest element.
    //? worst case (already sorted or reverse sorted array)
    // QuickSort Algorithm 
    public static void quickSort(int[] arr, int sIdx, int eIdx) {
    // Base Case: If the start index exceeds the end index, return
        if (sIdx > eIdx) {
        return;
        }
    // Partition the array and get the pivot index
        int pivotIndex = partition(arr, sIdx, eIdx);
    // Recursively apply QuickSort to the left and right subarrays
        quickSort(arr, sIdx, pivotIndex - 1);
        quickSort(arr, pivotIndex + 1, eIdx);
    }

    // Partition function to rearrange elements around the pivot
    public static int partition(int[] arr, int sIdx, int eIdx) {
        int pivot = arr[eIdx]; // Choosing the last element as the pivot
        int i = sIdx - 1; // Pointer for the smaller element
        // Traverse the array and rearrange elements
        for (int j = sIdx; j < eIdx; j++) {
            if (arr[j] < pivot) {
                i++;
                // Swap arr[i] and arr[j] to place the smaller element in the correct position
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // Place the pivot element in its correct position
        i++;
        int temp = pivot;
        arr[eIdx] = arr[i];
        arr[i] = temp;
        return i; // Return the index of the pivot element
    }


    public static void main(String[] args) {
        int arr[] = { 9,6, 3, 9, 5, 2, 8,20 };
        System.out.print("Unsorted : ");
        printArray(arr);
        quickSort(arr, 0, arr.length - 1);
        System.out.print("Solve sorted order : ");
        printArray(arr);
    }
}
