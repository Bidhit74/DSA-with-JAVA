public class SubArrays {
    //Q:- Sub Arrays --> Sub Array is a continuous part of array.
    // Time Complexity (TC): O(n³)
    public static void printSubArrays(int[] arr) {
        int n = arr.length;
        int totalSubarray = n * (n + 1) / 2;
        for (int start = 0; start < n; start++) {
            for (int end = start; end < n; end++) {
                System.out.print("[ ");
                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k]+" ");
                }
                System.out.print("] ");
            }
            System.out.println();
        }
        System.out.println("Total number of Sub Array = "+ totalSubarray);
    }
    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10};
        printSubArrays(arr);
    }
}