# Bubble Sort :- Large Element come to the end of array by swapping with adjacent elements.

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

-   Time Complexity: Best -> O(n) Wrost -> O(n^2) Space Complexity :- O(1)

# Slection sort :- Pick the smallest (from unsorted) put it at the beginning.

    public static void selectionSort(int[] arr) {
            int n = arr.length;
            for (int i = 0; i < n - 1; i++) {
                int minIndex = i;
                // smallest element in the unsorted part
                for (int j = i + 1; j < n; j++) {
                    if (arr[j] < arr[minIndex]) {
                        minIndex = j;
                    }
                }
                // Swap the smallest element with the current element
                if (minIndex != i) { // Avoid unnecessary swaps
                    int temp = arr[i];
                    arr[i] = arr[minIndex];
                    arr[minIndex] = temp;
                }
            }
        }

-   Time Complexity: O(n^2)  Space Complexity :- O(1)

# InsertionSort : Pick an element (from unsorted part) & place in the right position in sorted part.

    public static void insertionSort(int[] arr) {
            int n = arr.length;
            for (int i = 1; i < n; i++) {
                int current = arr[i]; // Pick the element to be inserted
                int prev = i - 1; //comparing from the last element of the sorted   part
                // Shift elements of the sorted part to make space for 'current'
                while (prev >= 0 && arr[prev] > current) {
                    arr[prev + 1] = arr[prev]; // Move element one position to the  right
                    prev--; // Move to the previous element
                }
                // Place 'current' in its correct position
                arr[prev + 1] = current;
            }
        }

-   Time Complexity: Best -> O(n) Wrost -> O(n^2) Space Complexity :- O(1)

# Counting Sort :- Works best for sorting integers in a small range.

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

-   Time Complexity: O(n+k)  Space Complexity :- O(k)
