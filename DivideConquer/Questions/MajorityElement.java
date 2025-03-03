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
    public static void main(String[] args) {
        int[] nums = {3,2,3};
        System.out.println(majorityElement(nums));
    }
}
