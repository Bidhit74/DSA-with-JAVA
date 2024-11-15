public class BubbleSort {
    // Bubble Sort 
    // Note Idea :- Large Element come to the end of array by swapping with adjacent elements.

    // Time Complexity 
    // Wrost Case : O(n^2)
    // Best Case : O(n)
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // To optimize if the array is already sorted  
            boolean swapped = false;     
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swaping with adjecent element
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no swapping happened, the array is sorted
            if (!swapped) {
                break;
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
        int arr[] = { 1, 2, 3, 4, 5 };
        printArray(arr);
        bubbleSort(arr);
        printArray(arr);
    }
}