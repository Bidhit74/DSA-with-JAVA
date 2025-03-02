// Question 1: Apply merge sort to sort an array of Strings.(Assume that all the characters in All the Strings are in lowercase) (EASY)
// Sample input: arr = {"sun", "earth", "mars", "mercury"}
// Sample output: arr = {"earth", "mars", "mercury", "sun"}
public class MergeSortArrayString {

    public static void printArray(String[] arr) {
        for (String str : arr) {
            System.out.print(str + " ");
        }
        System.out.println();
    }
    public static String[] mergeSort(String[] arr, int lo, int hi) {
        // Base case: If only one element is left, return it as a single-element array
        if (lo == hi) {
            return new String[]{ arr[lo] };
        }
    
        // Calculate the middle index
        int mid = lo + (hi - lo) / 2;
    
        // Recursively sort the left half of the array
        String[] left = mergeSort(arr, lo, mid);
    
        // Recursively sort the right half of the array
        String[] right = mergeSort(arr, mid + 1, hi);
    
        // Merge the sorted left and right halves and return the result
        return merge(left, right);
    }
    
    public static String[] merge(String[] lStrings, String[] rStrings) {
        int m = lStrings.length; // Length of left sorted array
        int n = rStrings.length; // Length of right sorted array
    
        String[] result = new String[m + n]; // Array to store the merged result
        int i = 0, j = 0, idx = 0;
    
        // Merge elements from both arrays in sorted order
        while (i < m && j < n) {
            // Compare and insert the smaller string first
            if (lStrings[i].compareTo(rStrings[j]) < 0) {
                result[idx++] = lStrings[i++];
            } else {
                result[idx++] = rStrings[j++];
            }
        }
    
        // Copy remaining elements from the left array (if any)
        while (i < m) {
            result[idx++] = lStrings[i++];
        }
    
        // Copy remaining elements from the right array (if any)
        while (j < n) {
            result[idx++] = rStrings[j++];
        }
    
        return result; // Return the merged sorted array
    }
    

    public static void main(String[] args) {
        String[] arr = { "sun", "earth", "mars", "mercury" };
        System.out.println("Before Sorting: ");
        printArray(arr);
        arr = mergeSort(arr, 0, arr.length - 1);
        System.out.println("After Sorting: ");
        printArray(arr);
    }
}
