// Question 3: Given an array of integers. Find the Inversion Count in the array. (Hard)

// Inversion Count: For an array, inversion count indicates how far (or close) the array is from being sorted. If the array is already sorted, then the inversion count is 0. If an array is sorted in the reverse order, the inversion count is the maximum.
//Formally, two elements a[i] and a[j] form an inversion if a[i] > a[j] and i < j.

// Input 1: N = 5, arr[] = {2, 4, 1, 3, 5}
// Output 1: 3, because it has 3 inversions: (2, 1), (4, 1), (4, 3)

// Input 2: N = 5, arr[] = {2, 3, 4, 5, 6}
// Output 2: 0, because it is already sorted

// Input 3: N = 3, arr[] = {5, 5, 5}
// Output 3: 0, because all the elements of the array are same and already in a sorted manner.

// Hint: (A sorting algorithm can be used to solve this problem.)



public class InversionCount {

    // Brute force Approach 
    // Time Complexity O(n^2) and Space Complexity O(1)
    public static int inversionCount(int[] arr) {
        int n = arr.length;
        int inversion = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j] && i < j) {
                    inversion++;
                }
            }
        }
        return inversion;
    }
    
    // Optimal Approach
    //Time Complexity O(n log n) and space complexity O(n)

    public static int merge(int[] arr, int sIdx, int mid, int eIdx) {
        int[] tempArr = new int[eIdx - sIdx + 1];
        int i = sIdx, j = mid, k = 0, invCount = 0;

        while ((i < mid) && (j <= eIdx)) {
            if (arr[i] <= arr[j]) {
                tempArr[k++] = arr[i++];
            } else {
                tempArr[k++] = arr[j++];
                invCount += (mid - i);
            }
        }
        
        while (i < mid) {
            tempArr[k++] = arr[i++];
        }
        while (j<=eIdx) {
            tempArr[k++] = arr[j++];
        }

        // Copy temporary array into original array.
        for (k = 0, i = sIdx; k < tempArr.length; k++, i++) {
            arr[i] = tempArr[k];
        }
        return invCount;
    }

    public static int mergeSort(int[] arr, int sIdx, int eIdx) {
        int invCount = 0;
        if (sIdx < eIdx) {
            int mid = sIdx + (eIdx - sIdx) / 2;
            invCount += mergeSort(arr, sIdx, mid); // Left part
            invCount += mergeSort(arr, mid + 1, eIdx); // Right part
            invCount += merge(arr, sIdx, mid + 1, eIdx); // merge left and right parts
        }
        return invCount;
    }

    public static int getInversionCount(int[] arr) {
        int n = arr.length;
        return mergeSort(arr, 0, n - 1);
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 1, 3, 5 };
        int[] arr1 = { 2, 3, 4, 5, 6 };
        int[] arr2 = { 5, 5, 5 };
        System.out.println(inversionCount(arr));
        System.out.println(inversionCount(arr1));
        System.out.println(inversionCount(arr2));

        System.out.println(getInversionCount(arr));
        System.out.println(getInversionCount(arr1));
        System.out.println(getInversionCount(arr2));
    }
}
