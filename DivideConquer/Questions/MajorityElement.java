// Question 2: Given an array of size n, return the majority element.(Medium)

// The majority element is the element that appears more than [n/2] times. You may assume that the majority element always exists in the array.

// Input 1: nums = [3,2,3]
// Output 1: 3
// Input 2: nums = [2,2,1,1,1,2,2]
// Output 2: 2

// Constraints:(extra Conditions)
// n == nums.length
// 1 <= n <= 5 * 10^4
// -10^9 <= nums[i] <= 10^9


public class MajorityElement {

    // Approach 1: Brute Force Approach
    // Time Complexity: O(n^2)
    //Idea : Count the number of times each element occurs in the array and find the largest count.
    /* 
    public static int majorityElement(int[] nums) {
        int n = nums.length;
        int majorityCount = n / 2;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count > majorityCount) {
                return nums[i];
            }
        }
        return -1;
    }
        */
    
    // Approach 2: Divide & Conquer
    // Time Complexity: O(n log n)
    //Idea : if we know the majority element in the left and right halves of an array, we can determine which is the global majority element linear time.

    // Counts occurrences of a given number in the specified range of the array
    private static int countInRange(int[] nums, int num, int min, int max) {
        int count = 0;
        for (int i = min; i <= max; i++) {
            if (nums[i] == num) {
                count++;
            }
        }
    return count;
    }

// Recursively finds the majority element in the given range using the Divide and Conquer approach
    public static int majorityElement(int[] nums, int min, int max) {
        // Base case: If there is only one element, return it as the majority
        if (min == max) {
            return nums[min];
        }
        
        // Divide: Find the middle index
        int mid = min + (max - min) / 2;
        
        // Recursively find the majority element in left and right halves
        int left = majorityElement(nums, min, mid);
        int right = majorityElement(nums, mid + 1, max);
    
        // If both halves return the same element, it's the majority element
        if (left == right) {
            return left;
        }
    
        // Count occurrences of both elements in the current range
        int leftCount = countInRange(nums, left, min, max);
        int rightCount = countInRange(nums, right, min, max);
    
        // Return the element that appears more frequently
        return leftCount > rightCount ? left : right;
    }


    public static void main(String[] args) {
        int[] nums = {3,2,3};
        // System.out.println(majorityElement(nums));
        System.out.println(majorityElement(nums, 0, nums.length - 1));
    }
}
