// Problem - 7 : Find the first occurence of a number in array using recursion. 
// Problem - 8 : Find the last occurence of a number in array using recursion.

public class FirstAndLastOccurence {

    public static int firstOccurence(int[] arr, int idx, int key) {
        // Base Case
        if (idx == arr.length) {
            return -1;
        }
        // Find first occurrence of key
        if (arr[idx] == key) {
            return idx;
        }
        // Recursive Case
        return firstOccurence(arr, idx + 1, key);
    }
    public static int lastOccurence(int[] arr, int idx, int key) {
        // Base Case: If the index has reached the end of the array
        if (arr.length == idx) {
            return -1; // Key not found, return -1
        }
        // Recursive Case: Find last occurrence by checking the rest of the array
        int isFound = lastOccurence(arr, idx + 1, key);
        // If key is not found in the remaining array and current element matches key
        if (isFound == -1 && arr[idx] == key) {
            return idx; // Return the current index as the last occurrence
        }
        return isFound; // Return the index where the key is found
    }
    
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 5, 6, 7, 8, 9, 2, 10 };
        System.out.println(firstOccurence(arr, 0, 2)); // 1
        System.out.println(lastOccurence(arr, 0, 2)); // 8
        System.out.println(firstOccurence(arr, 0, 3)); // -1
        System.out.println(lastOccurence(arr, 0, 3)); // -1
    }
}
