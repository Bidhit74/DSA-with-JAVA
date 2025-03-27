// Monotonic ArrayList
//  An Arraylist is monotonic if it is either monotone increasing or monotone decreasing.
//  AnArraylist nums ismonotone increasing if for all i <= j, nums.get(i) <=nums.get(j). An
//  Arraylist nums is monotone decreasing if for all i <= j, nums.get(i) >= nums.get(j).
//  Given an integer Arraylist nums, return true if the given list is monotonic, or false otherwise.

// Sample Input 1 : nums = [1,2,2,3]
// Sample Output 1: true
// Sample Input 2 : nums = [6,5,4,4]
// Sample Output 2: true
// Sample Input 3 : nums = [1,3,2]
// Sample Output 3: false

// Constraints:
// ● 1 <= nums.size() <= 105
// ●-105 <= nums.get(i) <= 105

import java.util.ArrayList;
import java.util.List;

public class MonotonicArrayList {
    public static boolean isMonotonic(ArrayList<Integer> nums) {
        boolean increasing = true, decreasing = true;
        for (int i = 1; i < nums.size(); i++) {
            // Increase
            if (nums.get(i) > nums.get(i - 1)) {
                decreasing = false;
            }
            // Decrease
            else if(nums.get(i) < nums.get(i - 1)) {
                increasing = false;
            }
        }
            return increasing || decreasing;
    }
    public static void main(String[] args) {
        ArrayList<Integer> nums1 = new ArrayList<>(List.of(1,2,2,3));
        ArrayList<Integer> nums2 = new ArrayList<>(List.of(6,5,4,4));
        ArrayList<Integer> nums3 = new ArrayList<>(List.of(1,3,2));
        System.out.println(isMonotonic(nums1)); 
        System.out.println(isMonotonic(nums2)); 
        System.out.println(isMonotonic(nums3)); 
    }
}
