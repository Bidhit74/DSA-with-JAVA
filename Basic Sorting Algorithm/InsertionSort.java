public class InsertionSort {
    // InsertionSort : Pick an element (from unsorted part) & place in the right position in sorted part.

    // Time Complexity : Best O(n)  Wrost O(n^2) 
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        
        for (int i = 1; i < n; i++) {
            int current = arr[i]; // Pick the element to be inserted
            int prev = i - 1; // Start comparing from the last element of the sorted part
            
            // Shift elements of the sorted part to make space for 'current'
            while (prev >= 0 && arr[prev] > current) {
                arr[prev + 1] = arr[prev]; // Move element one position to the right
                prev--; // Move to the previous element
            }
            
            // Place 'current' in its correct position
            arr[prev + 1] = current;
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
        insertionSort(arr);
        printArray(arr);
    }
}
