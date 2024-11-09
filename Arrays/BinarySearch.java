public class BinarySearch {
    // Binary Search
    // Time Complexity = O(log n)
    // O(log n) better than O(n)  // esiliye Binary search better than linear search
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
    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10, 12, 14, 16 };
        int key = 16;
        int index = binarySearch(arr, key);
        if (index == -1) {
            System.out.println("Key = " + key + " Not found");
        }
        else {
            System.out.println("Key = " + key + "  index = " + index);
        }
    }
}
