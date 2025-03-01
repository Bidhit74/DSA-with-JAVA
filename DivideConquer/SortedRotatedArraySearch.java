// Question: Search in Rotated Sorted Array
// Input:- Sorted, rotated array with distinct number (in ascending order). It is rotated at a pivot point. Find the index of given element.
// Arr = [4, 5, 6, 7, 0, 1, 2]; Target = 0;
// Output: 4


public class SortedRotatedArraySearch {


    // The function follows a modified binary search approach.
    // Time and Space Complexity is O(log n)
    public static int rotatedArraySearch(int[] arr, int trg, int sIdx, int eIdx) {
        // Base case: If start index exceeds end index, target is not present
        if (sIdx > eIdx) {
            return -1;
        }
    
        // Calculate the middle index
        int mid = sIdx + (eIdx - sIdx) / 2;
    
        // If the middle element is the target, return its index
        if (arr[mid] == trg) {
            return mid;
        }
    
        // Check if the left half is sorted
        if (arr[sIdx] <= arr[mid]) {
            // If target lies within the sorted left half, search in the left half
            if (arr[sIdx] <= trg && arr[mid] >= trg) {
                return rotatedArraySearch(arr, trg, sIdx, mid - 1);
            }
            // Otherwise, search in the right half
            return rotatedArraySearch(arr, trg, mid + 1, eIdx);
        }
    
        // If left half is not sorted, then the right half must be sorted
        // If target lies within the sorted right half, search in the right half
        if (arr[mid] <= trg && arr[eIdx] >= trg) {
            return rotatedArraySearch(arr, trg, mid + 1, eIdx);
        }
        // Otherwise, search in the left half
        return rotatedArraySearch(arr, trg, sIdx, mid - 1);
    }
    
    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
        int Target = 0;
        System.out.println(rotatedArraySearch(arr, Target, 0, arr.length-1));
    }
}
