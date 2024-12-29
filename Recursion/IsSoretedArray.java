// Problem 6 :- Check if a given array is sorted or not.

public class IsSoretedArray {
    // Time and Space Complexity is O(n)
    public static boolean isSorted(int[] arr, int index) {
        if (index == arr.length - 1) {
            return true; // Base case: Reached the end of the array
        } 
        if (arr[index] > arr[index + 1]) {
            return false; // If current element is greater than the next, array is not sorted
        }
        return isSorted(arr, index + 1); // Recursive case: Check the next pair
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] arr1 = {1, 2, 6, 4, 5};
        int[] arr2 = {5};
        System.out.println(isSorted(arr, 0));
        System.out.println(isSorted(arr1, 0));
        System.out.println(isSorted(arr2, 0));
    }
}
