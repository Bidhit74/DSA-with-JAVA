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

# Binary Search

    public static int binarySearch(int[] arr,int search) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end-start) / 2;
            if (arr[mid] == search) {
                return mid;
            } else if (arr[mid] < search) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

-   O(log n) better than O(n) // Binary search better than linear search

# Reverse Array - Less Efficient

    public static int[] reverseArray(int[] arr) {
        int[] reverse = new int[arr.length];
        for (int i = 0; i < reverse.length; i++) {
            int index = arr.length - i - 1;
            reverse[i] = arr[index];
        }
        System.out.println();
        return reverse;
    }

-   Time Complexity: O(n)  Space Complexity : O(n)  Less Efficient

# Reverse Array - More Efficient

    public static void reverseArray(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            // Using swaping method  // in-place reversal
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

-   Time Complexity: O(n)  Space Complexity : O(1)  More Efficient

# Q : Max Sub Array Sum

# Frute force method: Time Complexity --> O(n^3) Space Complexity --> O(1)

    public static int maxSubArraySum_BruteForce(int[] arr) {
        int maxSumOfArrays = Integer.MIN_VALUE;
        int n = arr.length;
        for (int start = 0; start < n; start++) {
            for (int end = start; end < n; end++) {
                int currentSum = 0;
                for (int k = start; k <= end; k++) {
                    currentSum += arr[k];
                }
                if (maxSumOfArrays < currentSum) {
                    maxSumOfArrays = currentSum;
                }
            }
        }
        return maxSumOfArrays;
    }

# Prifix Sum Methods :: Time Complexity --> O(n^2) Space Complexity --> O(n)

    public static int maxSubArraySum_PrifixSum(int[] arr) {
        int maxSumOfArrays = Integer.MIN_VALUE;
        int n = arr.length;
        int currentSum = 0;
        int prifix[] = new int[n];
        prifix[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prifix[i] = prifix[i - 1] + arr[i];
        }
        for (int start = 0; start < n; start++) {
            for (int end = start; end < n; end++) {
                currentSum = start == 0 ? prifix[end] : prifix[end] - prifix[start - 1];
                if (maxSumOfArrays < currentSum) {
                    maxSumOfArrays = currentSum;
                }
            }
        }
        return maxSumOfArrays;
    }

# Using Kadane's Algorithm -- The best method to solve the problem - Time Complexity --> O(n) Space Complexity --> O(1)

    public static int maxSubArraySum_KandanesAlorithm(int[] arr) {
        int maxSumOfArrays = Integer.MIN_VALUE;
        int n = arr.length;
        int currentSum = 0;
        for (int i = 0; i < n; i++) {
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            maxSumOfArrays = Math.max(maxSumOfArrays, currentSum);
        }
        return maxSumOfArrays;
    }
