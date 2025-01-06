// Question :- For a given integer array of size N. You have to find all the occurrences(Indices) of a given element(key) and print them. Use a recursive function to solve this problem.

// Input : arr[] = {3,2,4,5,6,2,7,2,2} , key = 2
// Output : 1 5 7 8 
public class FindOccurrencesOFIndex {

    // Time And Space Complexity :- O(n)
    public static void printOccurrencesIndex(int[] arr, int idx, int key) {
        // Base Case: If the index is out of bounds, stop recursion
        if (idx >= arr.length) {
            return;
        }
        // Print the index if the current element matches the key
        if (arr[idx] == key) {
            System.out.print(idx + " ");
        }
        // Recursive Call: Check the next index
        printOccurrencesIndex(arr, idx + 1, key);
    }
    
    public static void main(String[] args) {
        int arr[] = { 3, 2, 4, 5, 6, 2, 7, 2, 2 };
        int key = 2;
        printOccurrencesIndex(arr, 0, key);
    }
}
