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
