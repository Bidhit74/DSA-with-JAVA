public class MaxSubArraySum {
    // Q : Max Sub Array Sum
    // arr = [1, -2, 3 ,-1, 4]
    // [1] [1, -2] [1, -2, 3] [1, -2, 3, -1] [1, -2, 3, -1, 4]
    // [-2] [-2, 3] [-2, 3, -1] [-2, 3, -1, 4]
    // [3] [3, -1] [3, -1, 4]
    // [-1] [-1, 4]
    // [4]
    // Sub of All Arrays 
    // 1, -1, 2, 1, 5
    // -2, 1, 0, 4
    // 3, 2, 6
    // -1, 3
    // 4
    // Give me Output -->  Max Sub Array Sum ==> 6
    // Time Complexity --> O(n^3)
    // Space Complexity --> O(1)
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

    // Prifix Sum Methods
    // Max Sub Arrays Sum 
    // Time Complexity --> O(n^2)
    // Space Complexity --> O(n)
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
    
    //Using Kadane's Algorithm -- The best method to solve the problem
    // Time Complexity --> O(n)
    // Space Complexity --> O(1)
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
    public static void main(String[] args) {
        int arr[] = { 1, -2, 3, -1, 4 };
        System.out.println("Max SubArray Sum using Brute Force Method = " + maxSubArraySum_BruteForce(arr));
        System.out.println("Max SubArray Sum using prifix sum of array Method = " + maxSubArraySum_PrifixSum(arr));
        System.out.println("Max SubArray Sum using Kandane's Alorithm = " + maxSubArraySum_KandanesAlorithm(arr));

    }
}
