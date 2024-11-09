# Definition:- List of Elements of the same data type placed in a contiguous memory location.

# Creating an Array

-   datatype arrayName[ ] = new datatype[size];

# Array Nature:

1. Fixed Size – Arrays have a fixed size, meaning the number of elements is set at the time of creation and cannot be changed.

2. Indexed Access – Elements can be accessed directly using an index, starting from 0.

3. Homogeneous – All elements in an array are of the same data type.

4. Continuous Memory Allocation – Elements are stored in contiguous memory locations, providing fast access.

# Array Input, Output & Update:

int arr[] = new int[3]; // Array with 3 elements

arr[0] = 10;

arr[1] = 20;

arr[2] = 30;

for (int i = 0; i < arr.length; i++) {
System.out.println(arr[i]); // Output: 10 20 30
}

arr[1] = 50; // Update element at index 1
System.out.println(arr[1]); // Output: 50

# Arrays as Function/Method Argument.

-   In Java, when an array is passed to a method, a copy of the reference is passed, so changes made within the method affect the original array.
    public static void modifyArray(int arr[] ) {
    arr[0] = 100; // Changes the original array }

    In Java, both modifyArray(int[] arr) and modifyArray(int arr[]) are valid and mean the same. The only difference is the syntax:
    I. int[] arr is preferred for better readability.
    II. int arr[] is an older style but works the same.

# Linear Search

    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (key == arr[i]) {
                return i;
            }
        }
        return -1;
    }

-   Best Case TC: O(1)
-   Worst Case TC: O(n)
-   Space Complexity (for both cases): O(1)
